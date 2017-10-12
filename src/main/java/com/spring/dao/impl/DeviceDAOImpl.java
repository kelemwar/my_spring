package com.spring.dao.impl;

import com.spring.dao.DeviceDAO;
import com.spring.model.Device;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Pavl_io54 on 12.10.2017.
 */
public class DeviceDAOImpl implements DeviceDAO{
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;



    public void setDataSource(DataSource dataSource){

        this.dataSource = dataSource;
        jdbcTemplate = new JdbcTemplate(this.dataSource);

    }

    public List<Device> getAll(){
        return jdbcTemplate.query(GET_ALL, new DeviceMapper());
    }

   private  class DeviceMapper implements RowMapper<Device>{
        public Device mapRow(ResultSet rs, int rowNum) throws SQLException {
            Device device = new Device();
            device.setId(rs.getInt("id"));
            device.setName(rs.getString("name"));
            device.setLocation(rs.getString("location"));
            return device;

        }

   }


}

package com.spring.dao.impl;

import com.spring.dao.DeviceDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

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


}

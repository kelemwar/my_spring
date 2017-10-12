package com.spring.dao;

import com.spring.model.Device;

import java.util.List;

/**
 * Created by Pavl_io54 on 12.10.2017.
 */
public interface DeviceDAO {
    List<Device> getAll();
    String GET_ALL = "SELECT * FROM DEVICE";



}

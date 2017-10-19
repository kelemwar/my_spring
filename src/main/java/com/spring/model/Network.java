package com.spring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Pavl_io54 on 09.10.2017.
 */
@Component
public class Network {
    private String name;
    private Device locationA;
    private Device locationB;

    @Autowired
    public Network (Device locationA, Device locationB){
        this.locationA = locationA;
        this.locationB = locationB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Device getLocationA() {
        return locationA;
    }

//    public void setLocationA(Device locationA) {
//        this.locationA = locationA;
//    }

    public Device getLocationB() {
        return locationB;
    }

//    public void setLocationB(Device locationB) {
//        this.locationB = locationB;
//    }


}

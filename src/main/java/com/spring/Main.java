package com.spring;


import com.spring.dao.impl.DeviceDAOImpl;
import com.spring.model.Network;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Pavl_io54 on 09.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext dsCntx = new ClassPathXmlApplicationContext("ds.xml");
        DeviceDAOImpl deviceDAO = (DeviceDAOImpl) dsCntx.getBean("deviceDAO");
        System.out.println(deviceDAO);

    }


}

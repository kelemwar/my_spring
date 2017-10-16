package com.spring.controller;

import com.spring.dao.DeviceDAO;
import com.spring.model.Device;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Pavl_io54 on 16.10.2017.
 */
@Controller
@RequestMapping(value = "/device")
public class DeviceController {

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list (Model model) {
        ApplicationContext dsCntx = new ClassPathXmlApplicationContext("ds.xml");
        DeviceDAO deviceDAO = (DeviceDAO) dsCntx.getBean("deviceDao") ;
        List<Device> deviceList = deviceDAO.getAll();
        model.addAttribute("deviceList", deviceList);
        return "device/list";

    }


}

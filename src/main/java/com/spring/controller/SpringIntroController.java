package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Pavl_io54 on 16.10.2017.
 */
@Controller
public class SpringIntroController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index () {return "index";}

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String indexP () {return "index";}
}

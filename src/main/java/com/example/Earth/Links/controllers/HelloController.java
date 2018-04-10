package com.example.Earth.Links.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    @RequestMapping(value = "")
    @ResponseBody
    public String index() {
        return "Hello World";
    }

}

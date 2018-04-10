package com.example.Earth.Links.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("EarthLinks")
public class EarthLinksController {

    @RequestMapping(value = "")
    public String index() {
        return "EarthLinks/index";
    }

}
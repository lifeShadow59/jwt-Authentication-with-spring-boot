package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(){
        System.out.println("dfdfdf");
        return "Welcome to the JWT program";
    }
}

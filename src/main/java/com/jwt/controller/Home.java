package com.jwt.controller;

import com.jwt.model.JwtRequest;
import com.jwt.services.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Home {
    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome() {
        return "Welcome to the JWT program";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public ResponseEntity<ArrayList<JwtRequest>> getUser() {
        return ResponseEntity.ok(customUserDetailsService.getAllUsersList());
    }
}

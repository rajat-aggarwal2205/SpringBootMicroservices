package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/users", method = RequestMethod.GET)
public class UsersController {

    private Environment env;

    @Autowired
    public UsersController(Environment env){
        this.env = env;
    }

    @GetMapping("/status/check")
    @LoadBalanced
    public String getStatus(){
        return "Service is working on port:" + env.getProperty("local.server.port");
    }
}

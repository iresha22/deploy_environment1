package com.develhope.deploy_environment1.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class Controller {
    // parameters
    @Autowired
    private Environment environment;

    @GetMapping("/application")
    public String getProperty(){
        String info = environment.getProperty("myCustomVarTree.authCode");
        String name = environment.getProperty("myCustomVarTree.devName");
        return info + " " + name;
    }
}

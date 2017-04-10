package com.example.aonerd.cloud.poc.ui;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(method = GET)
    public String sayHello(){
        return "Hello welcome to the cloud";
    }

}

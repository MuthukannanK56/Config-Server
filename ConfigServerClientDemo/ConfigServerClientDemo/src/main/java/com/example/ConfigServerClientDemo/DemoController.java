package com.example.ConfigServerClientDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${password}")
    private String name;


    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getName() {
        return name;
    }


}

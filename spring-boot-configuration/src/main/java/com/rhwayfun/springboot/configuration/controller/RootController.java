package com.rhwayfun.springboot.configuration.controller;

import com.rhwayfun.springboot.configuration.property.SimpleProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RootController {
    @Autowired
    private SimpleProperty simpleProperty;

    @GetMapping
    public SimpleProperty hi(){
        return simpleProperty;
    }
}

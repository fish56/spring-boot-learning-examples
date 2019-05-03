package com.rhwayfun.springboot.quickstart.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by chubin on 2017/9/10.
 */
@RestController
public class DemoController {

    @RequestMapping("/")
    public String now(){
        return "hello, it is " + new Date().toString();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}

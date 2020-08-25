package com.cloud.eureka7001.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/info")
    public String getInfo(){
        String message = "hello world!";
        return message;
    }
}

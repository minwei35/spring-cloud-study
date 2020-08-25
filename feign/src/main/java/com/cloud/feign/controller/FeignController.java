package com.cloud.feign.controller;

import com.cloud.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: feign控制器
 * @author: JeremySan
 * @create: 2020-08-25
 **/
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/info")
    public String getInfo(){
        return feignService.getInfo();
    }
}

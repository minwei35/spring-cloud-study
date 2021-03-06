package com.cloud.ribbon.controller;

import com.cloud.ribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description: ribbon控制器
 * @author: JeremySan
 * @create: 2020-08-24
 **/
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/info")
    public String getRibbonInfo(){
        return ribbonService.getInfo();
    }

}

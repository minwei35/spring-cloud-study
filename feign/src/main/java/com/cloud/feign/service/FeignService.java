package com.cloud.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: demo
 * @description: feign服务类
 * @author: JeremySan
 * @create: 2020-08-25
 **/
@FeignClient(value = "EUREKA-CLIENT-7001")
public interface FeignService {

    @RequestMapping("/info")
    String getInfo();
}

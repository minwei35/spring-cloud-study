package com.cloud.feignhystrix.service;

import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description: feign失败调用函数
 * @author: JeremySan
 * @create: 2020-08-26
 **/
@Service
public class FeignFailService implements FeignService{
    @Override
    public String getInfo() {
        return "服务调用失败！";
    }
}

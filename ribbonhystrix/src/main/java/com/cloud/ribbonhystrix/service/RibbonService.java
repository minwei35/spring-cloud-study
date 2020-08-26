package com.cloud.ribbonhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo
 * @description: ribbon服务类
 * @author: JeremySan
 * @create: 2020-08-25
 **/
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoException")
    public String getInfo(){
        System.out.println("调用eureka-client的info方法");
        String message = restTemplate.getForObject("http://eureka-client-7001/info",String.class);
        System.out.println("调用成功，返回值为"+message);
        return message;
    }


    public String getInfoException(){
        return "发生错误！服务器停止响应！";
    }
}

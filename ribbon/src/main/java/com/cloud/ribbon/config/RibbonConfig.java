package com.cloud.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: demo
 * @description: ribbon设置
 * @author: JeremySan
 * @create: 2020-08-24
 **/
@Configuration
public class RibbonConfig {

    @Bean // 初始化 Bean
    @LoadBalanced // 实现负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

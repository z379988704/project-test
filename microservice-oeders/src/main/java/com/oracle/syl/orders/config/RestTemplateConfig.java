package com.oracle.syl.orders.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 19:09
 * @Version: 1.0
 **/
@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced//ribbon提供的附在均衡
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}

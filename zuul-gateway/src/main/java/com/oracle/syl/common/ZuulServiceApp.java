package com.oracle.syl.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 20:36
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZuulProxy
public class ZuulServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApp.class,args);
    }

}

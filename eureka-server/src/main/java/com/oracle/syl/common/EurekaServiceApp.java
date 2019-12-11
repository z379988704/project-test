package com.oracle.syl.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 12:30
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceApp.class,args);
    }
}

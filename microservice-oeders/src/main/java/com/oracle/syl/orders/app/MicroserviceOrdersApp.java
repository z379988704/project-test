package com.oracle.syl.orders.app;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import com.oracle.syl.orders.config.RestTemplateConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 17:17
 * @Version: 1.0
 **/
@SpringBootApplication
@ComponentScan("com.oracle.syl.orders")
@MapperScan("com.oracle.syl.orders.mapper")
@EnableTransactionManagement
@EnableEurekaClient
@EnableDiscoveryClient
@Import(RestTemplateConfig.class)
@EnableApolloConfig
public class MicroserviceOrdersApp {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrdersApp.class,args);
    }
}

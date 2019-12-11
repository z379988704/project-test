package com.oracle.syl.user.app;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 11:30
 * @Version: 1.0
 **/
@SpringBootApplication
@ComponentScan("com.oracle.syl.user")
@MapperScan("com.oracle.syl.user.mapper")
@EnableTransactionManagement
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients("com.oracle.syl.user.remote")//指定包路径，spring启动时会创建动态代理类的对象
@EnableHystrix//开启熔断器
@EnableApolloConfig
public class MicroserviceUserApp {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceUserApp.class,args);
    }
}

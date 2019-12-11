package com.xiupeilian.cat.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/4 13:36
 * @Version: 1.0
 **/
@Configuration
@MapperScan("com.xiupeilian.cat.mapper")
@EnableTransactionManagement
@ComponentScan("com.xiupeilian")

public class SsmConfig {
}

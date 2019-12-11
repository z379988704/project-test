package com.xiupeilian.cat.app;
import com.xiupeilian.cat.config.ShiroConfig;
import com.xiupeilian.cat.config.SpringCacheConfig;
import com.xiupeilian.cat.config.SsmConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/3 20:01
 * @Version: 1.0
 **/

@SpringBootApplication
@Import({SsmConfig.class, SpringCacheConfig.class, ShiroConfig.class})
public class kaishi {
    public static void main(String[] args) {
        SpringApplication.run(kaishi.class,args);
    }
}

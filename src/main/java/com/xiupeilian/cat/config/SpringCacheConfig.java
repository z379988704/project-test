package com.xiupeilian.cat.config;

import com.xiupeilian.cat.cache.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/4 13:37
 * @Version: 1.0
 **/
@Configuration
@EnableCaching
public class SpringCacheConfig {
    /*springboot整合reids之后RedisTemplate对象有spring自动创建*/
    @Autowired
    RedisTemplate redisTemplate;

    @Bean
    public SimpleCacheManager simpleCacheManager(){
        SimpleCacheManager simpleCacheManager = new SimpleCacheManager();
        RedisCache redisCache = new RedisCache();
        redisCache.setName("redisCache");
        redisCache.setRedisTemplate(redisTemplate);
        List<Cache> cacheList = new ArrayList<>();
        cacheList.add(redisCache);
        simpleCacheManager.setCaches(cacheList);
        return simpleCacheManager;
    }

}

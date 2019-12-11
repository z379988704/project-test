package com.oracle.syl.user.hystrix;

import com.oracle.syl.user.remote.OrdersService;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 20:08
 * @Version: 1.0
 **/
@Component//注入服务，spring、扫描之后会创建此对象
public class OrdersServiceHystrixFallBack implements OrdersService {
    @Override
    public String findOrdersAndUser(int id) {

        return "目标服务在一定时间范围内请求失败次数已达到临界值，该服务的线程池被熔断";
    }
}

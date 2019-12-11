package com.oracle.syl.user.remote;

import com.oracle.syl.user.hystrix.OrdersServiceHystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 19:31
 * @Version: 1.0
 **/
@FeignClient(value ="microservice-orders",fallback = OrdersServiceHystrixFallBack.class)//Feign组件的客户端，value是目标服务的id
//fallback指定回滚类
public interface OrdersService {
    @RequestMapping("/orders/getOrdersByIdToString")
    public String findOrdersAndUser(@RequestParam("id") int id);


}

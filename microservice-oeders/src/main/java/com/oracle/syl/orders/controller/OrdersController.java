package com.oracle.syl.orders.controller;

import com.oracle.syl.orders.mapper.OrdersMapper;
import com.oracle.syl.orders.model.Orders;
import com.oracle.syl.orders.service.OrdersService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 17:21
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/getOrdersById")
    public Orders getOrdersById(int id){
        return this.ordersService.findOrdersById(id);

    }
    @RequestMapping("/oedersInfo")
    public String oedersInfo(int id, HttpServletRequest request){
        Orders orders = this.ordersService.findOrdersById(id);
        String url = "http://microservice-user/user/userInfo?id="+orders.getId();
        String user = this.restTemplate.getForEntity(url,String.class).getBody();
        return request.getServerPort()+orders.toString()+user;

    }
    @RequestMapping("/getOrdersByIdToString")
    public String getOrdersByIdToString(int id,HttpServletRequest request){
        return this.ordersService.findOrdersById(id).toString()+request.getServerPort();

    }

}

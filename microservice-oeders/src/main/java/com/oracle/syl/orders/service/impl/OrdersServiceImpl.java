package com.oracle.syl.orders.service.impl;

import com.oracle.syl.orders.mapper.OrdersMapper;
import com.oracle.syl.orders.model.Orders;
import com.oracle.syl.orders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 17:20
 * @Version: 1.0
 **/
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Override
    public Orders findOrdersById(int id) {
        return this.ordersMapper.selectByPrimaryKey(id);
    }
}

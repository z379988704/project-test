package com.oracle.syl.orders.service;

import com.oracle.syl.orders.model.Orders;

/**
 * @Description:
 * @Author: Zhang Pu Rong
 * @CreateDate: 2019/12/9 17:20
 * @Version: 1.0
 **/
public interface OrdersService {
    Orders findOrdersById(int id);
}

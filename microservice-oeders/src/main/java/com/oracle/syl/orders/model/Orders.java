package com.oracle.syl.orders.model;

import java.io.Serializable;

public class Orders  implements Serializable {
    private Integer id;

    private String ordersKey;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdersKey() {
        return ordersKey;
    }

    public void setOrdersKey(String ordersKey) {
        this.ordersKey = ordersKey == null ? null : ordersKey.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", ordersKey='" + ordersKey + '\'' +
                ", status=" + status +
                '}';
    }
}
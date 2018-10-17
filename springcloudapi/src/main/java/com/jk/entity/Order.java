package com.jk.entity;

import java.math.BigDecimal;

public class Order {
    private String orderId;
    private String orderNum;
    private String orderDcse;
    private BigDecimal orderPrice;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrderDcse() {
        return orderDcse;
    }

    public void setOrderDcse(String orderDcse) {
        this.orderDcse = orderDcse;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }
}

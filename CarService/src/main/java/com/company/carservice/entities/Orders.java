package com.company.carservice.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ignat on 04.11.16.
 */
@Entity
public class Orders {
    private int orderId;
    private String orderscol;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "orderscol")
    public String getOrderscol() {
        return orderscol;
    }

    public void setOrderscol(String orderscol) {
        this.orderscol = orderscol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (orderId != orders.orderId) return false;
        if (orderscol != null ? !orderscol.equals(orders.orderscol) : orders.orderscol != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + (orderscol != null ? orderscol.hashCode() : 0);
        return result;
    }
}

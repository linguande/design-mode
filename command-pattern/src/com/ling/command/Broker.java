package com.ling.command;

import com.ling.service.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: broker
 * @author: linguande
 * @create: 2018-05-18 11:45
 **/
public class Broker {

    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}

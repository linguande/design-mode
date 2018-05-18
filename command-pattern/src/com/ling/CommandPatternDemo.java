package com.ling;

import com.ling.command.Broker;
import com.ling.command.Stock;
import com.ling.service.impl.BuyStock;
import com.ling.service.impl.SellStock;

/**
 * @description: command pattern demo
 * @author: linguande
 * @create: 2018-05-18 11:38
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();
    }
}

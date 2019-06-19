package com.ling.service.impl;

import com.ling.command.Stock;
import com.ling.service.Order;

/**
 * @description: buy stock
 * @author: linguande
 * @create: 2018-05-18 11:52
 **/
public class BuyStock implements Order {

    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    public BuyStock() {

    }

    @Override
    public void execute() {
        stock.buy();
    }
}

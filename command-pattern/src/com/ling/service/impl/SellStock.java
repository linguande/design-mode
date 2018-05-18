package com.ling.service.impl;

import com.ling.command.Stock;
import com.ling.service.Order;

/**
 * @description: sell stock
 * @author: linguande
 * @create: 2018-05-18 11:54
 **/
public class SellStock implements Order {

    private Stock stock;

    public SellStock() {

    }

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}

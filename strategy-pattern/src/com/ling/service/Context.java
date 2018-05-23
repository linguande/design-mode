package com.ling.service;

/**
 * @description: context
 * @author: linguande
 * @create: 2018-05-23 17:10
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}

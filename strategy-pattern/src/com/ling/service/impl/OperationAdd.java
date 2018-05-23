package com.ling.service.impl;

import com.ling.service.Strategy;

/**
 * @description: operation add
 * @author: linguande
 * @create: 2018-05-23 17:07
 **/
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

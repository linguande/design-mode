package com.ling.service.impl;

import com.ling.service.Strategy;

/**
 * @description: operation multiply
 * @author: linguande
 * @create: 2018-05-23 17:09
 **/
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}

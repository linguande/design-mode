package com.ling.service.impl;

import com.ling.service.Strategy;

/**
 * @description: operation substract
 * @author: linguande
 * @create: 2018-05-23 17:08
 **/
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

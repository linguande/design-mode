package com.ling;

import com.ling.service.Context;
import com.ling.service.impl.OperationAdd;
import com.ling.service.impl.OperationMultiply;
import com.ling.service.impl.OperationSubstract;

/**
 * @description: strategy pattern demo
 * @author: linguande
 * @create: 2018-05-23 16:58
 **/
public class StrategyPatternDemo {

    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}

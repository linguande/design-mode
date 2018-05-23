package com.ling;

import com.ling.entity.Context;
import com.ling.service.impl.StartState;
import com.ling.service.impl.StopState;

/**
 * @description: state pattern demo
 * @author: linguande
 * @create: 2018-05-23 11:48
 **/
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}

package com.ling.service.impl;

import com.ling.entity.Context;
import com.ling.service.State;

/**
 * @description: start state
 * @author: linguande
 * @create: 2018-05-23 11:51
 **/
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}

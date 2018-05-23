package com.ling.service.impl;

import com.ling.entity.Context;
import com.ling.service.State;

/**
 * @description: stop state
 * @author: linguande
 * @create: 2018-05-23 11:55
 **/
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop stater");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}

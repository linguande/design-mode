package com.ling.entity;

import com.ling.service.State;

/**
 * @description: context
 * @author: linguande
 * @create: 2018-05-23 11:49
 **/
public class Context {

    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

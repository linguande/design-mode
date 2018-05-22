package com.ling.entity;

/**
 * @description: memento
 * @author: linguande
 * @create: 2018-05-22 11:03
 **/
public class Memento {

    private String state;

    public Memento(){

    }

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

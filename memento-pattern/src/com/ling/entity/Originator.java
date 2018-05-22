package com.ling.entity;

/**
 * @description: originator
 * @author: linguande
 * @create: 2018-05-22 11:19
 **/
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMenento(Memento memento) {
        state = memento.getState();
    }
}

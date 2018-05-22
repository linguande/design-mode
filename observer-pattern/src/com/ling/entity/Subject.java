package com.ling.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: subject
 * @author: linguande
 * @create: 2018-05-22 17:37
 **/
public class Subject {

    private List<Observer> observerList = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

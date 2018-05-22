package com.ling.entity;

/**
 * @description: binary observer
 * @author: linguande
 * @create: 2018-05-22 17:42
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver() {

    }

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String : "
                + Integer.toBinaryString(subject.getState()));
    }
}

package com.ling.entity;

/**
 * @description: hexa observer
 * @author: linguande
 * @create: 2018-05-22 17:47
 **/
public class HexaObserver extends Observer {

    public HexaObserver() {

    }

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String :" +
                Integer.toHexString(subject.getState()).toUpperCase());
    }
}

package com.ling.entity;

/**
 * @description: octal observer
 * @author: linguande
 * @create: 2018-05-22 17:44
 **/
public class OctalObserver extends Observer {

    public OctalObserver() {

    }

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String : "
                + Integer.toOctalString(subject.getState()));
    }
}

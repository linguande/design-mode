package com.ling;

import com.ling.entity.BinaryObserver;
import com.ling.entity.HexaObserver;
import com.ling.entity.OctalObserver;
import com.ling.entity.Subject;

/**
 * @description: observer pattern demo
 * @author: linguande
 * @create: 2018-05-22 17:35
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change : 15");
        subject.setState(15);
        System.out.println("Second state chage : 10");
        subject.setState(10);
    }
}

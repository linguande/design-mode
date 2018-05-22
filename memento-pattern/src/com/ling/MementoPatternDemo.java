package com.ling;

import com.ling.entity.CareTaker;
import com.ling.entity.Originator;

/**
 * @description: memento pattern demo
 * @author: linguande
 * @create: 2018-05-22 11:02
 **/
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State : " + originator.getState());
        originator.getStateFromMenento(careTaker.get(0));
        System.out.println("First Saved State : " + originator.getState());
        originator.getStateFromMenento(careTaker.get(1));
        System.out.println("Second Saved State : " + originator.getState());
    }
}

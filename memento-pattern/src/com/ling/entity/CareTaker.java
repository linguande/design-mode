package com.ling.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: caretaker
 * @author: linguande
 * @create: 2018-05-22 11:23
 **/
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}

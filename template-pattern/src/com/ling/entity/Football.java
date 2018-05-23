package com.ling.entity;

/**
 * @description: football
 * @author: linguande
 * @create: 2018-05-23 17:48
 **/
public class Football extends Game {
    @Override
    void initalize() {
        System.out.println("Football Game Initialized! Start Playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Strated. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}

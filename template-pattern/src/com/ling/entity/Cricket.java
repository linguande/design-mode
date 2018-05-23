package com.ling.entity;

/**
 * @description: cricket
 * @author: linguande
 * @create: 2018-05-23 17:44
 **/
public class Cricket extends Game {
    @Override
    void initalize() {
        System.out.println("Cricket Game Initialized! Start Playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Strated.Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}

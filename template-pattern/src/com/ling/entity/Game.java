package com.ling.entity;

/**
 * @description: game
 * @author: linguande
 * @create: 2018-05-23 17:31
 **/
public abstract class Game {
    abstract void initalize();

    abstract void startPlay();

    abstract void endPlay();

    public final void play() {
        initalize();
        startPlay();
        endPlay();
    }

}

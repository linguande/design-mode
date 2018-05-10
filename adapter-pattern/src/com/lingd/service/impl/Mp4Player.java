package com.lingd.service.impl;

import com.lingd.service.AdvancedMediaPlayer;

/**
 * @description: mp4 player
 * @author: linguande
 * @create: 2018-05-10 11:26
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMap4(String fileName) {
        System.out.println("Playing mp4 file name : "+fileName);

    }
}

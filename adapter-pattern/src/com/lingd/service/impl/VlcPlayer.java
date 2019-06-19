package com.lingd.service.impl;

import com.lingd.service.AdvancedMediaPlayer;

/**
 * @description: vlcplayer
 * @author: linguande
 * @create: 2018-05-10 11:25
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file name : " + fileName);
    }

    @Override
    public void playMap4(String fileName) {

    }
}

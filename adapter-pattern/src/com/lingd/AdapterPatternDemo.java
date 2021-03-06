package com.lingd;

import com.lingd.service.impl.AudioPlayer;

/**
 * @description: adapter pattern
 * @author: linguande
 * @create: 2018-05-10 11:14
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far.vlc");
        audioPlayer.play("avi", "mind.avi");

    }
}

package com.lingd.service.impl;

import com.lingd.service.MediaPlayer;

/**
 * @description: 默认只能播放mp3，添加mp4/vlc适配器MediaAdapter
 * @author: linguande
 * @create: 2018-05-10 11:35
 **/
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if ("mp3".equalsIgnoreCase(audioType)) {
            System.out.println("Playing mp3 file name : " + fileName);
        } else if ("vlc".equalsIgnoreCase(audioType) || "mp4".equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("audio tyep : " + audioType + "not supported");
        }

    }
}

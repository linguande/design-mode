package com.ling.service.impl;

import com.ling.service.Image;

/**
 * @description: real image
 * @author: linguande
 * @create: 2018-05-17 17:41
 **/
public class RealImage implements Image {

    private String fileName;

    public RealImage() {

    }

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Dispalying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}

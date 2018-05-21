package com.ling.entity;

/**
 * @description: user
 * @author: linguande
 * @create: 2018-05-21 17:32
 **/
public class User {

    private String name;

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}

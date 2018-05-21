package com.ling.entity;

import java.util.Date;

/**
 * @description: chat room
 * @author: linguande
 * @create: 2018-05-21 17:35
 **/
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString()
                + " [ " + user.getName() + " ] : " + message);
    }
}

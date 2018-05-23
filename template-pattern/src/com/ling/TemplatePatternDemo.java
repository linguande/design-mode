package com.ling;

import com.ling.entity.Cricket;
import com.ling.entity.Football;
import com.ling.entity.Game;

/**
 * @description: template pattern demo
 * @author: linguande
 * @create: 2018-05-23 17:24
 **/
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}

package com.ling;

import com.ling.service.Iterator;
import com.ling.service.impl.NameRepository;

/**
 * @description: iterator pattern demo
 * @author: linguande
 * @create: 2018-05-21 11:28
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hashNext(); ) {
            String name = (String) iterator.next();
            System.out.println("Name : " + name);
        }
    }
}

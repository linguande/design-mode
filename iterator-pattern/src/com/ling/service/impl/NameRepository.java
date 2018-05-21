package com.ling.service.impl;

import com.ling.service.Container;
import com.ling.service.Iterator;

/**
 * @description: name repository
 * @author: linguande
 * @create: 2018-05-21 11:47
 **/
public class NameRepository implements Container {

    public String names[] = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {

        int index;

        @Override
        public boolean hashNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hashNext()) {
                return names[index++];
            }
            return null;
        }
    }
}

package com.ling.service.impl;

import com.ling.service.ComputerPart;
import com.ling.service.ComputerPartVisitor;

/**
 * @description: keyboard
 * @author: linguande
 * @create: 2018-05-23 18:11
 **/
public class KeyBoard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}

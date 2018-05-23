package com.ling.service;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}

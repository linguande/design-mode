package com.ling.service;

import com.ling.service.impl.Computer;
import com.ling.service.impl.KeyBoard;
import com.ling.service.impl.Monitor;
import com.ling.service.impl.Mouse;

public interface ComputerPartVisitor {
    void visit(Computer computer);

    void visit(Mouse mouse);

    void visit(KeyBoard keyBoard);

    void visit(Monitor monitor);
}

package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand! execute!");
    }

    @Override
    public void undo() {
        System.out.println("NoCommand! undo!");
    }
}

package com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("아무소리 못내는 오리!");
    }
}

package com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥꽥거리는 오리!");
    }
}

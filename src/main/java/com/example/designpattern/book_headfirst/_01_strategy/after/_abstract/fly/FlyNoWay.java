package com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날지 못하는 오리!");
    }
}

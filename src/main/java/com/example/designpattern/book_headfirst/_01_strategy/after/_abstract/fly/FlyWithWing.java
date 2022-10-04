package com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly;

public class FlyWithWing implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("날개로 날수 있는 오리!");
    }
}

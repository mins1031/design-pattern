package com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly;

public class FlyRocketPower implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓으로 날아간다!");
    }
}

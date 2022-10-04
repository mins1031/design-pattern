package com.example.designpattern.book_headfirst._01_strategy.before;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("빨간머리오리!");
    }

    @Override
    public void quack() {
        System.out.println("빨머빨머!");
    }
}

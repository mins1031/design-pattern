package com.example.designpattern.book_headfirst._01_strategy.before;

public class MallardDuck extends Duck {
    public MallardDuck(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("청동오리!");
    }

    @Override
    public void quack() {
        System.out.println("청동청동!");
    }
}

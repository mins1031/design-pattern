package com.example.designpattern.book_headfirst._01_strategy.after;

import com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly.FlyWithWing;
import com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(String name, int age) {
        super(name, age, new FlyWithWing(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("청동오리!");
    }

}

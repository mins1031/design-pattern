package com.example.designpattern.book_headfirst._01_strategy.after;

import com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly.FlyWithWing;
import com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack.MuteQuack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(String name, int age) {
        super(name, age, new FlyWithWing(), new MuteQuack());
    }

    @Override
    public void display() {
        System.out.println("빨간머리오리!");
    }

}

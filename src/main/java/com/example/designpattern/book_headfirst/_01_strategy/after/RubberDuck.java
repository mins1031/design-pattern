package com.example.designpattern.book_headfirst._01_strategy.after;

import com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly.FlyNoWay;
import com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack.MuteQuack;
import com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck(String name, int age) {
        super(name, age, new FlyNoWay(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("러버덕!");
    }

}

package com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("러버덕소리를 내는 오리!");
    }
}

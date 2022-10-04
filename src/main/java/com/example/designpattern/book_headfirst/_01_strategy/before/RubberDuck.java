package com.example.designpattern.book_headfirst._01_strategy.before;

public class RubberDuck extends Duck {
    public RubberDuck(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println("러버덕!");
    }

    @Override
    public void quack() {
        System.out.println("러버러버!");
    }

    @Override
    public void fly() {
        System.out.println("고무오리는 못날아요!");
    }
}

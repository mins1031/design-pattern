package com.example.designpattern.book_headfirst._07_adapter_facade.adapter;

public class MallarDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack?!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}

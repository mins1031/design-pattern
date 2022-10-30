package com.example.designpattern.book_headfirst._07_adapter_facade.adapter;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리를 날고 있다!@");
    }
}

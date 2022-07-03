package com.example.designpattern._21_strategy._02_after;

public class Fastest implements Speed {

    @Override
    public void blueLight() {
        System.out.println("무광꼬치");
    }

    @Override
    public void redLight() {
        System.out.println("폈슴다.");
    }
}

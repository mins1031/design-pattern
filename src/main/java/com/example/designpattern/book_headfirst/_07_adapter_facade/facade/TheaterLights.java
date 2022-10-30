package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class TheaterLights {

    public void on() {
        System.out.println("light on!");
    }

    public void off() {
        System.out.println("light off!");
    }

    public void dim(int i) {
        System.out.println("light dim!");
    }
}

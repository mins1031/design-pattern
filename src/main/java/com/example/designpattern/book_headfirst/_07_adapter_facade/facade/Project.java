package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class Project {

    private StreamingPlayer player;

    public Project(StreamingPlayer player) {
        this.player = player;
    }

    public void on() {
        System.out.println("project on!");
    }

    public void off() {
        System.out.println("project off!");
    }

    public void wideScreenMode() {
        System.out.println("wide screen mode!!");
    }
}

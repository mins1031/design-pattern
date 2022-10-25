package com.example.designpattern.lecture_baek._14_command.before;

public class Game {
    private boolean isStarted;

    public void on() {
        System.out.println("불을 켭니다.");
        this.isStarted = true;
    }

    public void off() {
        System.out.println("불을 끕니다.");
        this.isStarted = false;
    }

    public boolean isOn() {
        return this.isStarted;
    }
}

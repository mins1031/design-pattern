package com.example.designpattern.book_headfirst._06_command.step2.fan;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private String location;
    private int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = CeilingFan.OFF;
    }

    public void setSpeedHigh() {
        speed = CeilingFan.HIGH;
    }

    public void setSpeedMedium() {
        speed = CeilingFan.MEDIUM;
    }

    public void setSpeedLow() {
        speed = CeilingFan.LOW;
    }

    public void fanOff() {
        speed = CeilingFan.OFF;
    }

    public int getSpeed() {
        return speed;
    }
}

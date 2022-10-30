package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class Tuner {
    private Amplifer amplifer;
    private static final int AM_VOLUME = 3;
    private static final int FM_VOLUME = 7;

    public Tuner(Amplifer amplifer) {
        this.amplifer = amplifer;
    }

    public void on() {
        System.out.println("Tuner on!");
    }

    public void off() {
        System.out.println("Tuner off!");
    }

    public void setAm() {
        this.amplifer.setVolume(AM_VOLUME);
    }

    public void setFm() {
        this.amplifer.setVolume(FM_VOLUME);
    }
}

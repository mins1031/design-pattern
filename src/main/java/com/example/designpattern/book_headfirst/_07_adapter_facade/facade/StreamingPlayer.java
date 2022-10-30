package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class StreamingPlayer {

    private Amplifer amplifer;

    public StreamingPlayer(Amplifer amplifer) {
        this.amplifer = amplifer;
    }

    public void on() {
        System.out.println("player on!");
    }

    public void off() {
        System.out.println("player off!");
    }

    public void playMovie(String movie) {
        System.out.println("play movie!!");
    }
}

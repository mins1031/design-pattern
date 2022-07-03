package com.example.designpattern._21_strategy._02_after;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Faster());
        game.blueLight(new Fastest());
    }
}

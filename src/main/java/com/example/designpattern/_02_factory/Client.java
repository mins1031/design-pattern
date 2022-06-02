package com.example.designpattern._02_factory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "min@email.com");

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "min@email.com");

    }
}

package com.example.designpattern._02_factory;

import org.springframework.beans.factory.BeanFactory;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(), "WhiteShip", "min@email.com");
        client.print(new BlackShipFactory(), "BlackShip", "min@email.com");
        Ship whiteShip = new WhiteShipFactory().orderShip("WhiteShip", "min@email.com");
        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "min@email.com");

    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }


}

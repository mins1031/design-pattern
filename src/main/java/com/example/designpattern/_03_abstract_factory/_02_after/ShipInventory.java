package com.example.designpattern._03_abstract_factory._02_after;

import com.example.designpattern._02_factory.Ship;
import com.example.designpattern._02_factory.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteShipFactory(new BlackShipPartFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}

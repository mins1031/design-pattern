package com.example.designpattern.lecture_baek._03_abstract_factory._02_after;

import com.example.designpattern.lecture_baek._02_factory.Ship;
import com.example.designpattern.lecture_baek._02_factory.ShipFactory;
import com.example.designpattern.lecture_baek._02_factory.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        //파츠의 구현체가 당장은 whiteAnchor,  whiteWheel 밖에 없지만 만약 다른 파츠가 추가된다면? ex blackAnchor, blackWheel
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}

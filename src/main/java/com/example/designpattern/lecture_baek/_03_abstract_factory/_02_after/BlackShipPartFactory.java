package com.example.designpattern.lecture_baek._03_abstract_factory._02_after;

public class BlackShipPartFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new BlackAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new BlackWheel();
    }
}

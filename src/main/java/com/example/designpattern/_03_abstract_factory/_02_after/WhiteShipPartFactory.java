package com.example.designpattern._03_abstract_factory._02_after;

import com.example.designpattern._03_abstract_factory._01_before.WhiteAnchor;
import com.example.designpattern._03_abstract_factory._01_before.WhiteWheel;
import com.example.designpattern._03_abstract_factory._01_before.WhiteshipFactory;

public class WhiteShipPartFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}

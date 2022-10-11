package com.example.designpattern.book_headfirst._03_decorater.decorator;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class Whip extends CondimentDecorator {
    private static final double WHIP_PRICE = .10;

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + WHIP_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}

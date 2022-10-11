package com.example.designpattern.book_headfirst._03_decorater.decorator;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class Mocha extends CondimentDecorator {
    private static final double MOCHA_PRICE = .20;

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + MOCHA_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}

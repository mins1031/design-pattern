package com.example.designpattern.book_headfirst._03_decorater.decorator;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class Milk extends CondimentDecorator {
    private static final double MILK_PRICE = .10;

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + MILK_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}

package com.example.designpattern.book_headfirst._03_decorater.decorator;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class Soy extends CondimentDecorator {
    private static final double SOY_PRICE = .15;

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost() + SOY_PRICE;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}

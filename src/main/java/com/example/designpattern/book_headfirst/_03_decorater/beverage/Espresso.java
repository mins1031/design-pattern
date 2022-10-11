package com.example.designpattern.book_headfirst._03_decorater.beverage;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class Espresso extends Beverage {
    private static final double ESPRESSO_PRICE = 1.99;

    public Espresso() {
        setDescription("에스프레소");
    }

    @Override
    public double cost() {
        return ESPRESSO_PRICE;
    }
}

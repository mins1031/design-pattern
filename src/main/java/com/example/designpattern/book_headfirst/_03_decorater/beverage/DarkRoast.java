package com.example.designpattern.book_headfirst._03_decorater.beverage;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class DarkRoast extends Beverage {
    private static final double DARK_ROAST_PRICE = .89;

    public DarkRoast() {
        setDescription("다크로스트 커피");
    }

    @Override
    public double cost() {
        return DARK_ROAST_PRICE;
    }
}

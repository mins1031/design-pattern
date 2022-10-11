package com.example.designpattern.book_headfirst._03_decorater.beverage;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class DeCaffeine extends Beverage {
    private static final double DE_CAFFEINE_PRICE = 1.05;

    public DeCaffeine() {
        setDescription("디카페인 커피");
    }

    @Override
    public double cost() {
        return DE_CAFFEINE_PRICE;
    }
}

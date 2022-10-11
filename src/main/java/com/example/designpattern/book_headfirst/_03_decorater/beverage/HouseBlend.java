package com.example.designpattern.book_headfirst._03_decorater.beverage;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public class HouseBlend extends Beverage {
    private static final double HOUSE_BLEND_PRICE = .89;

    public HouseBlend() {
        setDescription("하우스 블랜드 커피");
    }

    @Override
    public double cost() {
        return HOUSE_BLEND_PRICE;
    }
}

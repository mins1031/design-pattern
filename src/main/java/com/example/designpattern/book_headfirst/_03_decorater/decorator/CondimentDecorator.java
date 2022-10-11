package com.example.designpattern.book_headfirst._03_decorater.decorator;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}

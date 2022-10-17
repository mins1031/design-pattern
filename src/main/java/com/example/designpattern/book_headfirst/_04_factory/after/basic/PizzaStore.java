package com.example.designpattern.book_headfirst._04_factory.after.basic;

import com.example.designpattern.book_headfirst._04_factory.after.basic.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}

package com.example.designpattern.book_headfirst._04_factory.after.chicago;

import com.example.designpattern.book_headfirst._04_factory.after.basic.Pizza;
import com.example.designpattern.book_headfirst._04_factory.after.basic.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else {
            return null;
        }
    }
}

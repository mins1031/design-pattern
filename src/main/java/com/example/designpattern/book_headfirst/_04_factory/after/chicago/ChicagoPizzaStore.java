package com.example.designpattern.book_headfirst._04_factory.after.chicago;

import com.example.designpattern.book_headfirst._04_factory.after.NY.NYStyleCheesePizza;
import com.example.designpattern.book_headfirst._04_factory.after.NY.NYStyleClamPizza;
import com.example.designpattern.book_headfirst._04_factory.after.NY.NYStyleGreekPizza;
import com.example.designpattern.book_headfirst._04_factory.after.NY.NYStylePepperoniPizza;
import com.example.designpattern.book_headfirst._04_factory.after.NY.NYStyleVeggiePizza;
import com.example.designpattern.book_headfirst._04_factory.after.Pizza;
import com.example.designpattern.book_headfirst._04_factory.after.PizzaStore;

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

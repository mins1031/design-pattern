package com.example.designpattern.book_headfirst._04_factory.after.basic;

import com.example.designpattern.book_headfirst._04_factory.after.basic.CheesePizza;
import com.example.designpattern.book_headfirst._04_factory.after.basic.GreekPizza;
import com.example.designpattern.book_headfirst._04_factory.after.basic.PepperoniPizza;
import com.example.designpattern.book_headfirst._04_factory.after.basic.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}

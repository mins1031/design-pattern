package com.example.designpattern.book_headfirst._04_factory.after.basic;

import com.example.designpattern.book_headfirst._04_factory.after.ingredient.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(String name, PizzaIngredientFactory pizzaIngredientFactory) {
        super(
                name,
                pizzaIngredientFactory.createDough(),
                pizzaIngredientFactory.createSauce(),
                pizzaIngredientFactory.createCheese(),
                pizzaIngredientFactory.createClam(),
                pizzaIngredientFactory.createPepperoni()
        );
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

    }
}

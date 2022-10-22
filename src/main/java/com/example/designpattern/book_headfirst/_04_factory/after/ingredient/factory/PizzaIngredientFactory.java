package com.example.designpattern.book_headfirst._04_factory.after.ingredient.factory;

import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.Cheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.Clam;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.Dough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.Pepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.Sauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Veggies;

import java.util.List;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public List<Veggies> createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}

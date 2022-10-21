package com.example.designpattern.book_headfirst._04_factory.after.ingredient;

import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.Cheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.MozzarellaCheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.ReggianoCheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.Clam;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.FreshClams;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.FrozenClams;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.Dough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.ThickCrustDough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.ThinCrustDough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.Pepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.SlicedPepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.MarinaraSauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.PlumTomatoSauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.Sauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.BlackOlives;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.EggPlant;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Garlic;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Mushroom;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Onion;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.RedPepper;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Spinach;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Veggies;

import java.util.Arrays;
import java.util.List;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    private final List<Veggies> veggiesList = Arrays.asList(new BlackOlives(), new Spinach(), new EggPlant());
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return veggiesList;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}

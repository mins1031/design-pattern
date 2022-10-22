package com.example.designpattern.book_headfirst._04_factory.after.ingredient.factory;

import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.Cheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.ReggianoCheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.Clam;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.FreshClams;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.Dough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.ThinCrustDough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.Pepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.SlicedPepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.MarinaraSauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.Sauce;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Garlic;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Mushroom;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Onion;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.RedPepper;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.vegetable.Veggies;

import java.util.Arrays;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    //밑의 리스트는 피자당 필요한 야채가 정해져 있기에 이렇게 필드로 가지게 해놨다. 그때그때 유동적이라면 생성자를 통해 주입을 받아도 된다고 생각하지만 일단 고정되어있다고 생각하고 이렇게 구현.
    private final List<Veggies> veggiesList = Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper());

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
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
        return new FreshClams();
    }
}

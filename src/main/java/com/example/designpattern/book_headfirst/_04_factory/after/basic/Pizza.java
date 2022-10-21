package com.example.designpattern.book_headfirst._04_factory.after.basic;

import com.example.designpattern.book_headfirst._04_factory.after.ingredient.cheese.Cheese;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.clam.Clam;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.dough.Dough;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.pepperoni.Pepperoni;
import com.example.designpattern.book_headfirst._04_factory.after.ingredient.sauce.Sauce;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private Cheese cheese;
    private Clam clam;
    private Pepperoni pepperoni;
    private List<String> toppings = new ArrayList<>();

    public Pizza(String name, Dough dough, Sauce sauce, Cheese cheese, Clam clam, Pepperoni pepperoni) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.clam = clam;
        this.pepperoni = pepperoni;
    }

    abstract public void prepare();

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    };

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    };

    public void box() {
        System.out.println("상자에 피자 담기");
    };

    public void addTopping(String topping) {
        this.toppings.add(topping);
    }
}

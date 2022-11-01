package com.example.designpattern.book_headfirst._08_templete_methed;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        addCondiments();
        addCondiments();
    }


    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}

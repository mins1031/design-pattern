package com.example.designpattern.book_headfirst._03_decorater;

import com.example.designpattern.book_headfirst._03_decorater.beverage.Beverage;
import com.example.designpattern.book_headfirst._03_decorater.beverage.DarkRoast;
import com.example.designpattern.book_headfirst._03_decorater.beverage.Espresso;
import com.example.designpattern.book_headfirst._03_decorater.beverage.HouseBlend;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Mocha;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Soy;
import com.example.designpattern.book_headfirst._03_decorater.decorator.Whip;

public class Client {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $ : " + espresso.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast); // 모카 추가
        darkRoast = new Mocha(darkRoast); // 모카 추가
        darkRoast = new Whip(darkRoast); // 모카 추가
        System.out.println(darkRoast.getDescription() + " $ : " + darkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " $ : " + houseBlend.cost());
    }
}

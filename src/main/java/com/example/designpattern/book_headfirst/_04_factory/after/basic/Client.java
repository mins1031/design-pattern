package com.example.designpattern.book_headfirst._04_factory.after.basic;

import com.example.designpattern.book_headfirst._04_factory.after.NY.NYPizzaStore;
import com.example.designpattern.book_headfirst._04_factory.after.chicago.ChicagoPizzaStore;

public class Client {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + nyPizza.getName() + "\n");

        Pizza chicagoPizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한" + chicagoPizza.getName() + "\n");
    }
}

package com.example.designpattern.book_headfirst._04_factory.before;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        //피자 메뉴가 추가되거나 없어지면 밑의 코드가 영향을 받는다
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        //밑의 피자 제작 과정은 어떤 종류의 피자나 동일하게 과정을 거치기에 변경되지 않는다.
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

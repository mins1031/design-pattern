package com.example.designpattern.book_headfirst._04_factory.after.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public abstract class Pizza {
    private String name;
    private String dough;
    private String sauce;
    private List<String> toppings = new ArrayList<>();

    public Pizza(String name, String dough, String sauce) {
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public void prepare() {
        System.out.println("피자준비중 : " + name);
        System.out.println("도우를 돌리는 중...");
        System.out.println("소스를 뿌리는 중...");
        System.out.println("토핑을 올리는 중...");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    };

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

package com.example.designpattern.book_headfirst._04_factory.after;

public class Pizza {

    public void prepare() {
        System.out.println("피자준비");
    };

    public void bake() {
        System.out.println("피자빵 굽기");
    };

    public void cut() {
        System.out.println("피자 자르기");
    };

    public void box() {
        System.out.println("피자 포장하기");
    };
}

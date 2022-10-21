package com.example.designpattern.book_headfirst._04_factory.after.NY;

import com.example.designpattern.book_headfirst._04_factory.after.basic.Pizza;

public class NYStyleCheesePizza extends Pizza {
    private static final String newyorkStyleName = "뉴욕 스타일 소스와 치즈 피자";
    private static final String newyorkStyleDough = "씬 크러스트 도우";
    private static final String newyorkStyleSauce = "마리나라 소스";
    private static final String newyorkStyleTopping = "잘게 썬 레지아노 치즈";

    public NYStyleCheesePizza() {
        super(newyorkStyleName, newyorkStyleDough, newyorkStyleSauce);
        addTopping(newyorkStyleTopping);
    }

    @Override
    public void prepare() {

    }
}

package com.example.designpattern.book_headfirst._04_factory.after.chicago;

import com.example.designpattern.book_headfirst._04_factory.after.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    private static final String chicagoStyleName = "시카고 스타일 딥 디쉬 치즈 피자";
    private static final String chicagoStyleDough = "아주 두꺼운 크러스트 도우";
    private static final String chicagoStyleSauce = "플럼 토마토 소스";
    private static final String chicagoStyleTopping = "잘게 조각낸 모짜렐라 치즈";

    public ChicagoStyleCheesePizza() {
        super(chicagoStyleName, chicagoStyleDough, chicagoStyleSauce);
        addTopping(chicagoStyleTopping);
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

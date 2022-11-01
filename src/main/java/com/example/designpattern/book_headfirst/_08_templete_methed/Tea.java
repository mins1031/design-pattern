package com.example.designpattern.book_headfirst._08_templete_methed;

public class Tea extends CaffeineBeverage {
    // Coffee랑 Tea를 공통적으로 추상화 할수 있을거 같은데?
    @Override
    public void brew() {
        System.out.println("찻잎을 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("레몬을 추가하는 중");
    }
}

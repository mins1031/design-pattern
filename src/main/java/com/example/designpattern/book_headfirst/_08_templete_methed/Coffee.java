package com.example.designpattern.book_headfirst._08_templete_methed;

public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("필터로 커피 우려내는 중");
    }

    @Override
    public void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}

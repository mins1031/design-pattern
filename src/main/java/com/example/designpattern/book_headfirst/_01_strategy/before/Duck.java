package com.example.designpattern.book_headfirst._01_strategy.before;

public class Duck {
    private String name;
    private int age;

    public Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 떠있을수 있습니다. 가짜오리도요!");
    }

    public void display() {
        System.out.println("오리에요!");
    }

    public void quack() {
        System.out.println("꽥꽥!");
    }

    public void fly() {
        System.out.println("날수 있다!");
    }
}

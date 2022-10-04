package com.example.designpattern.book_headfirst._01_strategy.after;

import com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly.FlyBehavior;
import com.example.designpattern.book_headfirst._01_strategy.after._abstract.quack.QuackBehavior;

public class Duck {
    private String name;
    private int age;

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck(String name, int age, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.name = name;
        this.age = age;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void swim() {
        System.out.println("모든 오리는 물에 떠있을수 있습니다. 가짜오리도요!");
    }

    public void display() {
        System.out.println("오리에요!");
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    // 생성자로 행동을 주입받아 사용할땐 실행단계에서만 행동 정의가 가능했지만 세터를 사용함으로서 실행중에도 동적으로 행동을 주입(할당)해줄수 있다.
    // 밑의 두개의 세터는 행동을 동적으로 변경시킬수 있는 매개역할을 한다.... 딱 그역할로만 사용되면 좋다 딱...
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}

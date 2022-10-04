package com.example.designpattern.book_headfirst._01_strategy.after;


import com.example.designpattern.book_headfirst._01_strategy.after._abstract.fly.FlyRocketPower;

public class Client {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck("청동오리", 2);
        mallardDuck.performFly();
        mallardDuck.performQuack();

        RedHeadDuck redHeadDuck = new RedHeadDuck("빨머오리", 2);
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        RubberDuck rubberDuck = new RubberDuck("러버덕", 2);
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.setFlyBehavior(new FlyRocketPower());
        rubberDuck.performFly();
    }
}

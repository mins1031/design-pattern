package com.example.designpattern.book_headfirst._01_strategy.before;

public class Client {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck("청동오리", 2);

        RedHeadDuck redHeadDuck = new RedHeadDuck("빨머오리", 2);
        RubberDuck rubberDuck = new RubberDuck("러버덕", 2);
    }
}

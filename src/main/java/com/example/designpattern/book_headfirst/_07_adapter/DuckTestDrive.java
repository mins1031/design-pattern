package com.example.designpattern.book_headfirst._07_adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();

        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("칠면조가 말하길");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("오리가 말하길");
        testDuck(mallarDuck);

        System.out.println("칠면조 어뎁터가 말하길");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

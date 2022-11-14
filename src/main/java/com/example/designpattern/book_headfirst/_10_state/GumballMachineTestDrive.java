package com.example.designpattern.book_headfirst._10_state;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        //after
        AfterGumballMachine afterGumballMachine = new AfterGumballMachine(5);

        System.out.println(afterGumballMachine);

        afterGumballMachine.insertQuarter();
        afterGumballMachine.turnCrank();

        System.out.println(afterGumballMachine);

        afterGumballMachine.insertQuarter();
        afterGumballMachine.turnCrank();
        afterGumballMachine.insertQuarter();
        afterGumballMachine.turnCrank();

        System.out.println(afterGumballMachine);
        //before
//        BeforeGumballMachine beforeGumballMachine = new BeforeGumballMachine(5);
//        System.out.println(beforeGumballMachine);
//
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//
//        System.out.println(beforeGumballMachine);
//
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.ejectQuarter();
//        beforeGumballMachine.turnCrank();
//
//        System.out.println(beforeGumballMachine);
//
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//        beforeGumballMachine.ejectQuarter();
//
//        System.out.println(beforeGumballMachine);
//
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//        beforeGumballMachine.insertQuarter();
//        beforeGumballMachine.turnCrank();
//
//        System.out.println(beforeGumballMachine);
    }
}

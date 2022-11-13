package com.example.designpattern.book_headfirst._10_state;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        BeforeGumballMachine beforeGumballMachine = new BeforeGumballMachine(5);
        System.out.println(beforeGumballMachine);

        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();

        System.out.println(beforeGumballMachine);

        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.ejectQuarter();
        beforeGumballMachine.turnCrank();

        System.out.println(beforeGumballMachine);

        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();
        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();
        beforeGumballMachine.ejectQuarter();

        System.out.println(beforeGumballMachine);

        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();
        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();
        beforeGumballMachine.insertQuarter();
        beforeGumballMachine.turnCrank();

        System.out.println(beforeGumballMachine);
    }
}

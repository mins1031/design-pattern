package com.example.designpattern.book_headfirst._10_state.state;

import com.example.designpattern.book_headfirst._10_state.AfterGumballMachine;

public class NoQuarterState implements State {
    private AfterGumballMachine gumballMachine;

    public NoQuarterState(AfterGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전을 넣으셨습니다.");
        this.gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어주세요");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 넣어주세요");
    }
}

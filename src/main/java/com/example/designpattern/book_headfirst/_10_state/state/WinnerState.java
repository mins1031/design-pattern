package com.example.designpattern.book_headfirst._10_state.state;

import com.example.designpattern.book_headfirst._10_state.AfterGumballMachine;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WinnerState implements State {
    private AfterGumballMachine gumballMachine;

    public WinnerState(AfterGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("로그보단 예외를 뱉는게 맞아보인다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("로그보단 예외를 뱉는게 맞아보인다");
    }

    @Override
    public void turnCrank() {
        System.out.println("로그보단 예외를 뱉는게 맞아보인다");
    }

    @Override
    public void dispense() {
        System.out.println("축하합니다! 알맹이를 하나더 받으실수 있습니다.");
    }
}

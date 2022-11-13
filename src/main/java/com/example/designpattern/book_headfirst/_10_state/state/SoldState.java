package com.example.designpattern.book_headfirst._10_state.state;

import com.example.designpattern.book_headfirst._10_state.AfterGumballMachine;

public class SoldState implements State {
    private AfterGumballMachine gumballMachine;

    public SoldState(AfterGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("알맹이를 내보내고 있습니다. 잠시만 기다려 주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("이미 알맹이를 뽑으셨습니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("이미 손바이를 돌리셨습니다.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("알맹이가 모두 소진 되었습니다!!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}

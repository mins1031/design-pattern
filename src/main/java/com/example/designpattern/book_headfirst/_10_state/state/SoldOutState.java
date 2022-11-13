package com.example.designpattern.book_headfirst._10_state.state;

import com.example.designpattern.book_headfirst._10_state.AfterGumballMachine;

public class SoldOutState implements State {
    private AfterGumballMachine gumballMachine;

    public SoldOutState(AfterGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    //여기서 뭔가 머신의 카운트를 확인하고 0 이상이면 다시 상태를 재조정하는 코드가 있으면 좋을거 같기는 한데 일단은 이렇게 둔다.

    @Override
    public void insertQuarter() {
        System.out.println("알맹이가 모두 소진되어 뽑기를 진행할 수 없습니다.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("알맹이 소진 상태 입니다.");
    }

    @Override
    public void turnCrank() {
        System.out.println("알맹이 소진 상태 입니다.");
    }

    @Override
    public void dispense() {
        System.out.println("알맹이 소진 상태 입니다.");
    }
}

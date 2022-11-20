package com.example.designpattern.book_headfirst._10_state.state;

import com.example.designpattern.book_headfirst._10_state.AfterGumballMachine;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class HasQuarterState implements State {
    private AfterGumballMachine gumballMachine;

    public HasQuarterState(AfterGumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("동전은 한개만 넣어 주세요.");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전이 반환됩니다.");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("알맹이를 내보낼 수 없습니다.");
    }
}

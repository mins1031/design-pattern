package com.example.designpattern.book_headfirst._11_proxy;

import com.example.designpattern.book_headfirst._10_state.state.HasQuarterState;
import com.example.designpattern.book_headfirst._10_state.state.NoQuarterState;
import com.example.designpattern.book_headfirst._10_state.state.SoldOutState;
import com.example.designpattern.book_headfirst._10_state.state.SoldState;
import com.example.designpattern.book_headfirst._10_state.state.State;
import com.example.designpattern.book_headfirst._10_state.state.WinnerState;
import lombok.Getter;

@Getter
public class ProxyGumballMachine {
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count = 0;

    public ProxyGumballMachine(int count) {
        this.soldOutState = new SoldOutState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldState = new SoldState(this);
        this.winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            state = this.noQuarterState; // 알멩이가 있기에 뽑기를 할수 있는 상태지만 동전이 들어오지 않았기에 일단 기회없음 상태로 시작(애초에 현재 뽑기 시스템의 처음상태는 NoQuarter긴함.)
        } else {
            state = this.soldOutState; // 알멩이가 없으면 솔드아웃.
        }
    }

    public void insertQuarter() {
        this.state.insertQuarter();
    }

    public void ejectQuarter() {
        this.state.ejectQuarter();
    }

    public void turnCrank() {
        this.state.turnCrank();
        this.state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("알맹이를 내보내고 있습니다.");
        if (count > 0) {
            this.count = this.count - 1;
        }
    }

    @Override
    public String toString() {
        return "GumballMachine{" +
                "state=" + state +
                ", count=" + count +
                '}';
    }
}

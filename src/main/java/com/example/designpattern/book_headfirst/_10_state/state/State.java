package com.example.designpattern.book_headfirst._10_state.state;

public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}

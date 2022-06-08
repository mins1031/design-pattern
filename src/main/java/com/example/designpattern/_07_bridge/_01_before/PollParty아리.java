package com.example.designpattern._07_bridge._01_before;

public class PollParty아리 implements Champion{
    @Override
    public void move() {
        System.out.println("PollParty아리 move");
    }

    @Override
    public void skillQ() {
        System.out.println("PollParty아리 Q");
    }

    @Override
    public void skillW() {
        System.out.println("PollParty아리 W");
    }

    @Override
    public void skillE() {
        System.out.println("PollParty아리 E");
    }

    @Override
    public void skillR() {
        System.out.println("PollParty아리 R");
    }
}

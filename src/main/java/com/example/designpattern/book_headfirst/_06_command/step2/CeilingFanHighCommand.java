package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;
import com.example.designpattern.book_headfirst._06_command.step2.fan.CeilingFan;

public class CeilingFanHighCommand implements Command {
    private CeilingFan ceilingFan;
    private int prevSpeed; //가끔 command에 상태값을 저장이 필요한 경우가 있을수 있다. 그 예시이다.

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        this.ceilingFan.setSpeedHigh();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            this.ceilingFan.setSpeedHigh();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            this.ceilingFan.setSpeedMedium();
        } else if (prevSpeed == CeilingFan.LOW) {
            this.ceilingFan.setSpeedLow();
        } else if (prevSpeed == CeilingFan.OFF) {
            this.ceilingFan.fanOff();
        }
    }
}

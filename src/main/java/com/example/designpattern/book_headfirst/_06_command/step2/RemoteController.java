package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;

import java.util.Arrays;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------리모컨--------");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}

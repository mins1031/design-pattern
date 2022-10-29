package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;

import java.util.Stack;

public class RemoteControllerWithStack {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    private Stack<Command> commandStack;

    public RemoteControllerWithStack() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = new NoCommand();
        this.commandStack = new Stack<>();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        undoCommand = onCommands[slot];
        commandStack.push(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        undoCommand = offCommands[slot];
        commandStack.push(offCommands[slot]);
    }

    public void undoButtonWaspushed() {
        undoCommand.undo();
        commandStack.pop();
    }

    public void executeCommandUtilNow() {
        for (Command command : commandStack) {
            command.execute();
        }
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

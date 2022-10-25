package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;

public class RemoteController {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteController() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i< 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }
}

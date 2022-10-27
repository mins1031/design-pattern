package com.example.designpattern.book_headfirst._06_command.step2;

import com.example.designpattern.book_headfirst._06_command.step1.Command;

public class MacroCommand implements Command {
    //여러가지 동작을 한번에 수행하기 위한 커맨드이다. 한명령에 커맨드들이 실행되게 하고 싶을떄 사용하면 좋을 구조일것 같다.
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        return;
    }
}

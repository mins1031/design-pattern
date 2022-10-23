package com.example.designpattern.book_headfirst._06_command.step1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SimpleRemoteController {
    private Command slot;

    public void setSlot(Command slot) {
        this.slot = slot;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}

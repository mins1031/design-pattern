package com.example.designpattern.book_headfirst._06_command.step1;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteController simpleRemoteController = new SimpleRemoteController();
        Light light = new Light() {
            @Override
            public void on() {
                System.out.println("조명이 켜짐!@");
            }
        };
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        GarageDoor garageDoor = new GarageDoor() {
            @Override
            public void up() {
                System.out.println("차고문 열기!@");
            }
        };
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        simpleRemoteController.setSlot(lightOnCommand);
        simpleRemoteController.buttonWasPressed();

        simpleRemoteController.setSlot(garageDoorOpenCommand);
        simpleRemoteController.buttonWasPressed();
    }
}

package com.example.designpattern.lecture_baek._14_command.before;


public class Button {

    private LightInBaek light;

    public Button(LightInBaek light) {
        this.light = light;
    }

    public void press() {
        light.on();
    }

    public static void main(String[] args) {
        Button button = new Button(new LightInBaek());
        button.press();
        button.press();
        button.press();
    }
}

package com.example.designpattern._01_singleton;

public class App {

    public static void main(String[] args) {
        Setting setting = Setting.getInstance();
        Setting setting1 = Setting.getInstance();
        System.out.println(setting == setting1);
    }
}

package com.example.designpattern.lecture_baek._21_strategy._01_before;

public class Client {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(1);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}

package com.example.designpattern.lecture_baek._07_bridge._02_after;

import com.example.designpattern.lecture_baek._07_bridge._01_before.Champion;

public class App {

    public static void main(String[] args) {
        Champion KDAAri = new Ari(new KDA());
        KDAAri.skillQ();
        KDAAri.skillW();

        Champion pollPartyAri = new Ari(new PollParty());
        pollPartyAri.skillR();
        pollPartyAri.skillW();
    }
}

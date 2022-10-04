package com.example.designpattern.lecture_baek._04_builder._02_after;

import com.example.designpattern.lecture_baek._04_builder._01_before.TourPlan;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan plan = tourDirector.cancunTrip();

        System.out.println(plan);
    }
}

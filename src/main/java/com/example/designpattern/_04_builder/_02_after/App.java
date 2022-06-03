package com.example.designpattern._04_builder._02_after;

import com.example.designpattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        TourDirector tourDirector = new TourDirector(new DefaultTourBuilder());
        TourPlan plan = tourDirector.cancunTrip();

        System.out.println(plan);
    }
}

package com.example.designpattern._04_builder._02_after;

import com.example.designpattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip() {
        return tourPlanBuilder
                .title("제주 여행")
                .nightAndDays(2, 3)
                .startDate(LocalDate.of(2020, 10, 14))
                .whereToStay("hotel")
                .addPlan(2, "점심먹기")
                .getPlan();
    }
}

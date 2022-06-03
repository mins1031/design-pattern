package com.example.designpattern._04_builder._02_after;

import com.example.designpattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public interface TourPlanBuilder {
    //이처럼 리턴값이 TourPlanBuilder이기에 계속 같은 값을 반환한다.
    TourPlanBuilder nightAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    //TourPlanBuilder의 추가가 끝나면 Plan을 반환하는 메서드
    TourPlan getPlan();
}

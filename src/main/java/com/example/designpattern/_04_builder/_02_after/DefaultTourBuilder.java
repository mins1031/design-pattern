package com.example.designpattern._04_builder._02_after;

import com.example.designpattern._04_builder._01_before.DetailPlan;
import com.example.designpattern._04_builder._01_before.TourPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;

    private List<DetailPlan> plans = new ArrayList<>();

    @Override
    public TourPlanBuilder nightAndDays(int nights, int days) {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        //이곳엔 필수 값이 다 채워졌나 검증도 가능할듯.근데 여기보단 각 메서드에서 봐주는게 좋을거 같기도하고... 코드 반복떄문에 여기도 좋을거 같고.....
        return new TourPlan(title, nights, days, startDate, whereToStay, plans);
    }
}

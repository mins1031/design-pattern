package com.example.designpattern.book_headfirst._03_decorater.beverage;

public abstract class Beverage {
    private String description = "제목 없음";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

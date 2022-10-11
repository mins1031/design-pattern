package com.example.designpattern.book_headfirst._03_decorater.beverage;

public abstract class Beverage {
    private String description = "제목 없음";
    private BeverageSize beverageSize;
    // 만약에 이렇게 음료에 사이즈가 생기고 이를통해 가격을 다시 할당한다면? 그리고 각 첨가물(데코레이터)마다 사이즈별로 가격을 다르게 적용한다면?
    // 결국 가격설정하는 if-else 로직이 데코별로 만들어지게 된다. 이부분을 어떻게 해결? -> 일단 이건 if-else를 위한 클래스를 따로 뺴든 메서드를 뺴든 해서 사용해야 할것 같다.

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BeverageSize getBeverageSize() {
        return beverageSize;
    }
}

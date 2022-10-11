package com.example.designpattern.book_headfirst._05_singleton;

public class AfterChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static final AfterChocolateBoiler CHOCOLATE_BOILER = new AfterChocolateBoiler();

    private AfterChocolateBoiler() {
        this.empty = empty;
        this.boiled = boiled;
    }

    public static AfterChocolateBoiler getInstance() {
        return CHOCOLATE_BOILER;
    }

    public void fill() { 
        if (isEmpty()) {
            this.empty = false;
            this.boiled = false;
            //보일러에 우유와 초콜릿을 혼합한 재료를 넣음
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            //끓인 재료를 다음 단계로 넘김
            this.empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            //재료를 끓임
            this.boiled = true;
        }
    }

    public boolean isEmpty() {
        return this.empty;
    }

    public boolean isBoiled() {
        return this.boiled;
    }
}

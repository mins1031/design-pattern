package com.example.designpattern.book_headfirst._05_singleton;

public class BeforeChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    public BeforeChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
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

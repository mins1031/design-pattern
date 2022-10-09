package com.example.designpattern.book_headfirst._02_observer.after;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    //밑의 메서드는 특정 인터페이스를 구현하고는 있지만 구현에 의존하고 있기에 변경에 취약하다.
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (this.observerList == null) {
            throw new IllegalStateException();
        }

        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (this.observerList == null) {
            throw new IllegalStateException();
        }

        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}

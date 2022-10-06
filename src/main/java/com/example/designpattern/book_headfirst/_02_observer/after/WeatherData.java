package com.example.designpattern.book_headfirst._02_observer.after;

import com.example.designpattern.book_headfirst._02_observer.before.Updater;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;
    private Updater currentConditionsDisplay;
    private Updater statisticsDisplay;
    private Updater forecastDisplay;

    public WeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    //밑의 메서드는 특정 인터페이스를 구현하고는 있지만 구현에 의존하고 있기에 변경에 취약하다.
    public void measurementsChanged() {
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //밑의 3줄을 캡슐화 해줘야한다. -> 옵저버 패턴 적용. 근데 전략패턴을 사용해도 되지 않나?
        currentConditionsDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}

package com.example.designpattern.book_headfirst._02_observer.after;

public class CurrentConditionsDisplay implements Observer, Display{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;//앤 왜 들어가 있지? 옵저버목록에서 빠질때 유용하다고?

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재상태: 온도 " + this.temperature + "F, 습도 " + this.humidity + "%");
    }
}

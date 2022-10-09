package com.example.designpattern.book_headfirst._02_observer.after;

public class WhetherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        //위에 생성한 WeatherData와 생성하며 옵저버로 추가된CurrentConditionsDisplay. 만들어 놓고 weatherData에 측정값을 적용하는 메서드인 setMeasurements가 동작하면 측정한 값이 저장되고 등록된 옵저버들에게 값이 전달되는 메서드가 실행된다.
    }
}

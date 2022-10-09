package com.example.designpattern.book_headfirst._02_observer.after;

public class CurrentConditionsDisplay implements Observer, Display{
    private float temperature;
    private float humidity;
    private WeatherData weatherData;//앤 왜 들어가 있지? 옵저버목록에서 빠질때 유용하다고?

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    //update는 필요한 데이터를 인자로 주입받던 형태에서 주입해주는 대상의 getter를 이용해 직접 가져오는 형태로 변경되었다.
    //why? -> 주제클래스의 기능이 많아질수록 여러 데이터가 생기고 각 옵저버 마다 필요없는 데이터역시 있을수 있다.
    // 이렇게 필요없는 내용도 모두 받아오기 보단 필요한것들만 골라서 주제에게 가져오게 주제가 열어두는 것이 장기적으로 보았을때는 더 효율적이다. (-> 장기적으로 변경점이 줄고 성능이 향상된다.)
    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재상태: 온도 " + this.temperature + "F, 습도 " + this.humidity + "%");
    }
}

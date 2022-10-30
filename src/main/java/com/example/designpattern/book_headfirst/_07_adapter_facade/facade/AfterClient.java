package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class AfterClient {
    public static void main(String[] args) {
        //필요한 클래스 선언부가 여전히 더럽긴한데... 실제로는 다른 곳에서 주입받을것 같기는하다. 아무튼 선언부보다는 여러 명령하는 코드들이 퍼사드 객체안으로 들어가 더 높은 추상화 단계를 구성했다는것이 포인트 이다.
        Amplifer amplifer = new Amplifer();
        Tuner tuner = new Tuner(amplifer);
        StreamingPlayer player = new StreamingPlayer(amplifer);
        amplifer.setTuner(tuner);
        amplifer.setStreamingPlayer(player);
        Project project = new Project(player);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amplifer, tuner, player, project, lights, screen, popcornPopper);

        String movie = "movie!!!";

        homeTheaterFacade.watchMovie(movie);
        homeTheaterFacade.endMovie();
    }
}

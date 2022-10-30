package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class BeforeClient {

    public static void main(String[] args) {
        String movie = "movie!!!";
        Amplifer amplifer = new Amplifer();
        Tuner tuner = new Tuner(amplifer);
        StreamingPlayer player = new StreamingPlayer(amplifer);
        amplifer.setTuner(tuner);
        amplifer.setStreamingPlayer(player);
        Project project = new Project(player);
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();

        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        project.on();
        project.wideScreenMode();
        amplifer.on();
        amplifer.setStreamingPlayer(player);
        amplifer.setStereoSound();
        amplifer.setVolume(5);
        player.on();
        player.playMovie(movie);
    }
}

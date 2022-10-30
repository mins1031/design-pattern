package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class HomeTheaterFacade {
    private Amplifer amplifer;
    private Tuner tuner;
    private StreamingPlayer player;
    private Project project;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifer amplifer, Tuner tuner, StreamingPlayer player, Project project, TheaterLights lights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifer = amplifer;
        this.tuner = tuner;
        this.player = player;
        this.project = project;
        this.lights = lights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비 시작!@!");
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

    public void endMovie() {
        System.out.println("홈시어터를 끄는 중");
        popcornPopper.off();
        lights.on();
        screen.up();
        project.off();
        amplifer.off();
        player.off();
    }
}

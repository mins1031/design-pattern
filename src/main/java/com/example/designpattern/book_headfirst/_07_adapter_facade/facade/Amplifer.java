package com.example.designpattern.book_headfirst._07_adapter_facade.facade;

public class Amplifer {

    private Tuner tuner;
    private StreamingPlayer streamingPlayer;
    private int volume;
    private static final int SURROUND_SOUND = 8;
    private static final int STEREO_SOUND = 8;

    public Amplifer() {
        this.volume = 5;
    }

    public void on() {
        System.out.println("amplifer on!");
    }

    public void off() {
        System.out.println("amplifer off!");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.streamingPlayer = streamingPlayer;
    }

    public void setStereoSound() {
        this.volume = STEREO_SOUND;
    }

    public void setSurroundSound() {
        this.volume = SURROUND_SOUND;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

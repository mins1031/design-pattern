package com.example.designpattern.book_headfirst._06_command.step2;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Stereo {
    private int volume;
    private boolean playing;
    private boolean inCD;

    public void on() {
        System.out.println("오디오를 켭니다.");
        this.playing = true;
    }

    public void setCD() {
        System.out.println("CD를 넣습니다.");
        this.inCD = true;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}

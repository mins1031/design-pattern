package com.example.designpattern.book_headfirst._02_observer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame jFrame;
    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.doing();
    }

    private void doing() {
        jFrame = new JFrame();

        JButton jButton = new JButton();

        //직접 옵저버 클래스를 만들어서 사용
        jButton.addActionListener(new AngelListner());
        jButton.addActionListener(new DevilListner());

        //람다식으로 옵저버 로직을 만들어 사용
        jButton.addActionListener(event -> System.out.println("nonono don't do that!"));
        jButton.addActionListener(event -> System.out.println("gogogo just do it!"));
    }

    private class AngelListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("nonono don't do that!");
        }
    }

    private class DevilListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("gogogo just do it!");
        }
    }
}

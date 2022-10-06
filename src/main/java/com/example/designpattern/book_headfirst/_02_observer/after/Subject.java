package com.example.designpattern.book_headfirst._02_observer.after;

public interface Subject {
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}

package com.raginggeek.examples.observer.observer;

public class ExampleObserver2 implements Observer {
    @Override
    public void update(String observable, int value) {
        System.out.println("Observer 2 detected a change in " + observable +
                " it has changes to " + String.valueOf(value));
    }
}
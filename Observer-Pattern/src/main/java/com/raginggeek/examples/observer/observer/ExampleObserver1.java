package com.raginggeek.examples.observer.observer;

public class ExampleObserver1 implements Observer {
    @Override
    public void update(String observable, int value) {
        System.out.println("Observer 1 detected a change in " + observable +
                " it has changes to " + String.valueOf(value));
    }
}

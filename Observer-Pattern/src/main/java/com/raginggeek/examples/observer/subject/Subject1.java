package com.raginggeek.examples.observer.subject;

import com.raginggeek.examples.observer.observer.Observer;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Subject1 implements Observable {

    private String name = "Subject 1";
    private List<Observer> observers = new ArrayList<>();
    private int flag;

    public void setFlag(int value) {
        this.flag = value;
        // need to notify anyone observing this object for the value change.
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(name, flag));
    }
}

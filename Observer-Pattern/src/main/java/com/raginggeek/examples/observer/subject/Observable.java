package com.raginggeek.examples.observer.subject;

import com.raginggeek.examples.observer.observer.Observer;

public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}

package com.raginggeek.examples.proxy.concretes;

public class ConcreteSubject implements Subject {

    @Override
    public void doSomeWork() {
        System.out.println("The real object doing the work");
    }
}

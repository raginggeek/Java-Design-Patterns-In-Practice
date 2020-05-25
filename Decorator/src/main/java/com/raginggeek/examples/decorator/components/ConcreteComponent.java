package com.raginggeek.examples.decorator.components;

public class ConcreteComponent implements Component {
    @Override
    public void doJob() {
        System.out.println("I am from the concrete component, doing my job and closed for mods.");
    }
}

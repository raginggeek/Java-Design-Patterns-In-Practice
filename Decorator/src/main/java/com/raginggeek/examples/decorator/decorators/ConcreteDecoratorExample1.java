package com.raginggeek.examples.decorator.decorators;

public class ConcreteDecoratorExample1 extends AbstractDecorator {
    public void doJob() {
        super.doJob();
        System.out.println("I am coming from the first concrete decorator, and adding detail after the initial work is done");
    }
}

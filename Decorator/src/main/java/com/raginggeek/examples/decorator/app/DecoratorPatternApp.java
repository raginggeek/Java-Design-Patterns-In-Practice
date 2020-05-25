package com.raginggeek.examples.decorator.app;

import com.raginggeek.examples.decorator.components.ConcreteComponent;
import com.raginggeek.examples.decorator.decorators.ConcreteDecoratorExample1;
import com.raginggeek.examples.decorator.decorators.ConcreteDecoratorExample2;

public class DecoratorPatternApp {
    public static void main(String[] args) {
        System.out.println("*** Decorator Pattern Demo ***");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecoratorExample1 cd1 = new ConcreteDecoratorExample1();
        ConcreteDecoratorExample2 cd2 = new ConcreteDecoratorExample2();
        cd1.setTheComponent(cc);
        cd1.doJob();
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
}

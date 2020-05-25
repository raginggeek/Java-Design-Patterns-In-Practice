package com.raginggeek.examples.decorator.decorators;

public class ConcreteDecoratorExample2 extends AbstractDecorator {
    @Override
    public void doJob() {
        System.out.println("");
        System.out.println("*** START Example Decorator 2 ***");
        System.out.println(" VERBOSE EXAMPLE ENGAGED ");
        super.doJob();
        System.out.println("Explicit from Example Decorator 2");
        System.out.println("pre and post fixed adjustments");
        System.out.println("*** END Example Decorator 2 ***");
    }
}

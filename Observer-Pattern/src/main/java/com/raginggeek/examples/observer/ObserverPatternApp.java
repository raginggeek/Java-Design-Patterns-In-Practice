package com.raginggeek.examples.observer;

import com.raginggeek.examples.observer.observer.ExampleObserver1;
import com.raginggeek.examples.observer.observer.ExampleObserver2;
import com.raginggeek.examples.observer.subject.Subject1;
import com.raginggeek.examples.observer.subject.Subject2;

public class ObserverPatternApp {
    public static void main(String[] args) {
        System.out.println("*** Observer Pattern Demonstration ***");
        ExampleObserver1 o1 = new ExampleObserver1();
        ExampleObserver2 o2 = new ExampleObserver2();
        Subject1 sub1 = new Subject1();
        Subject2 sub2 = new Subject2();
        sub1.register(o1);
        sub1.register(o2);
        sub2.register(o1);
        sub2.register(o2);
        System.out.println("setting flag value in subject 1 to 5");
        sub1.setFlag(5);
        System.out.println("settings flag value in subject 2 to 10");
        sub2.setFlag(10);
        System.out.println("setting flag to 25");
        sub1.setFlag(25);
        System.out.println("unregistering observer 1 from the subject 1");
        sub1.unregister(o1);
        System.out.println("setting flag in subject 1 to 50");
        sub1.setFlag(50);
        System.out.println("removing observer 2 from subject 2");
        sub2.unregister(o2);
        System.out.println("setting the flag in subject 2 to 80");
        sub2.setFlag(80);
    }
}

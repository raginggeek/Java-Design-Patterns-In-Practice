package com.raginggeek.examples.proxy.proxies;

import com.raginggeek.examples.proxy.concretes.ConcreteSubject;
import com.raginggeek.examples.proxy.concretes.Subject;

public class SubjectProxy implements Subject {

    ConcreteSubject cs;

    @Override
    public void doSomeWork() {
        System.out.println("Proxy making the call out to the concrete");
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}

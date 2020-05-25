package com.raginggeek.examples.proxy.app;

import com.raginggeek.examples.proxy.proxies.SubjectProxy;

public class ProxyExampleApp {
    public static void main(String[] args) {
        System.out.println("*** Proxy Pattern Demo ***");
        SubjectProxy proxy = new SubjectProxy();
        proxy.doSomeWork();
    }
}

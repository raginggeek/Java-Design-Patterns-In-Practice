package com.raginggeek.examples.decorator.decorators;

import com.raginggeek.examples.decorator.components.Component;

public class AbstractDecorator implements Component {
    protected Component com;

    public void setTheComponent(Component c) {
        com = c;
    }

    public void doJob() {
        if (com != null) {
            com.doJob();
        }
    }
}

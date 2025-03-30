package org.excited.kettle.experiments;

import org.springframework.stereotype.Component;

@Component
public class ComponentB {

    private final String input;

    public ComponentB(final String input) {
        this.input = input;
    }

    public String fence(){
        return input;
    }
}

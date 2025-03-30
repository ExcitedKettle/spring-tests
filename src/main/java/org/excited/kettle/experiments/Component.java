package org.excited.kettle.experiments;

@org.springframework.stereotype.Component
public class Component {

    private final String input;

    public Component(final String input) {
        this.input = input;
    }

    public String fence(){
        return input;
    }
}

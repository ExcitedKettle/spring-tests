package org.excited.kettle.experiments;

import org.excited.kettle.experiments.configuration.ConfigurationB;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ConfigurationB.class)
@Import({ConfigurationB.class, Component.class})
class ConfigurationB1Test {

    @Autowired
    private Component component;

    @Test
    void name() {
        final String result = component.fence();
        assertThat(result).isEqualTo("Bob");
    }
}
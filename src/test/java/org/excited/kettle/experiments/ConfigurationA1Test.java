package org.excited.kettle.experiments;

import org.excited.kettle.experiments.configuration.ConfigurationA;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ConfigurationA.class)
@Import({ConfigurationA.class, Component.class})
class ConfigurationA1Test {

    @Autowired
    private Component component;

    @Test
    void name() {
        final String result = component.fence();
        assertThat(result).isEqualTo("jeff");
    }
}
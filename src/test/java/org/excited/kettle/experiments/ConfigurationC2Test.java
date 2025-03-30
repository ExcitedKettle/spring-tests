package org.excited.kettle.experiments;

import org.excited.kettle.experiments.configuration.ConfigurationC;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ConfigurationC.class)
@Import({ConfigurationC.class, Component.class})
class ConfigurationC2Test {

    @Autowired
    private Component component;

    @Test
    void name() {
        final String result = component.fence();
        assertThat(result).isEqualTo("John");
    }

}
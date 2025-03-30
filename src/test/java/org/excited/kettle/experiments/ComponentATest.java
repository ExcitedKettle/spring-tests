package org.excited.kettle.experiments;

import org.excited.kettle.experiments.configuration.ConfigurationA;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ConfigurationA.class)
@Import({ConfigurationA.class, ComponentB.class})
class ComponentATest {

    @Autowired
    private ComponentB componentB;

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void name(final Integer value) {
        final String resylt = componentB.fence();
        assertThat(resylt).isEqualTo("jeff");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void name1(final Integer value) {
        final String resylt = componentB.fence();
        assertThat(resylt).isEqualTo("jeff");
    }
}
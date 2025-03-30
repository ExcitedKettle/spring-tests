package org.excited.kettle.experiments;

import org.excited.kettle.experiments.configuration.ConfigurationA;
import org.excited.kettle.experiments.configuration.ConfigurationB;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@SpringBootTest(classes = ConfigurationB.class)
@Import({ConfigurationB.class, ComponentB.class})
class ComponentTest {

    @Autowired
    private ComponentB componentB;

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void name(final Integer value) {
        final String resylt = componentB.fence();
        assertThat(resylt).isEqualTo("Bob");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
    void name1(final Integer value) {
        final String resylt = componentB.fence();
        assertThat(resylt).isEqualTo("Bob");
    }
}
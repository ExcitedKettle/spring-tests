package org.excited.kettle.experiments.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootConfiguration
public class ConfigurationA {

    @Bean
    public String input(){
        return"jeff";
    }
}

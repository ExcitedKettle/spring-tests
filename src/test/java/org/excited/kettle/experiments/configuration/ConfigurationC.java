package org.excited.kettle.experiments.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ConfigurationC {

    @Bean
    public String input(){
        return"John";
    }
}

package org.excited.kettle.experiments.configuration;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class ConfigurationB {

    @Bean
    public String input(){
        return"Bob";
    }
}

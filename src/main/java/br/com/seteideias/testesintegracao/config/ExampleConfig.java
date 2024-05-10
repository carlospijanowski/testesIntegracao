package br.com.seteideias.testesintegracao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ExampleConfig {

    @Bean
    @Profile("teste")
    public EnvirommentConfig inTest(){
        return new EnvirommentConfig("in test");
    }

    @Bean
    @Profile("!teste")
    public EnvirommentConfig inProduction(){
        return new EnvirommentConfig("in production");
    }

}




package br.com.seteideias.testesintegracao.config;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class EnvirommentConfig {

    private final String somePhrase;
    public EnvirommentConfig(String somePhrase){
        this.somePhrase = somePhrase;
    }

    public String doSomething () {
        log.info(somePhrase);
        return somePhrase;
    }

}

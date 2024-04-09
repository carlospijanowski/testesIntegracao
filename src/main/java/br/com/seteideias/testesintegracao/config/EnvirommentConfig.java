package br.com.seteideias.testesintegracao.config;

public class EnvirommentConfig {

    private  String somePhrase;
    public EnvirommentConfig(String somePhrase){
        this.somePhrase = somePhrase;
    }

    public void doSomething () {
        System.out.println(somePhrase);
    }

}

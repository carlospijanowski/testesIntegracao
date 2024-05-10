package br.com.seteideias.testesintegracao;

import br.com.seteideias.testesintegracao.config.EnvirommentConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ActiveProfiles("hml")
class IntegrationTest {

    @Autowired
    private EnvirommentConfig envirommentConfig;

    @Test
    void test (){
        var s = envirommentConfig.doSomething();
        Assertions.assertEquals("in production", s);
    }


}

package com.emard.design.pattern;

import com.emard.design.pattern.strategy.Canard;
import com.emard.design.pattern.strategy.Colvert;
import com.emard.design.pattern.strategy.Leurre;
import com.emard.design.pattern.strategy.interf.FakeCancan;
import com.emard.design.pattern.strategy.interf.NeSaisPasVoler;
import com.emard.design.pattern.strategy.interf.QuackComportement;
import com.emard.design.pattern.strategy.interf.VolerAvecDesAiles;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ApplicationRunner appStarted() {
        return args -> {
            Canard colvert = new Colvert(new QuackComportement(), new VolerAvecDesAiles());
            log.info("=================colvert");
            colvert.afficher();
            colvert.effecturevol();
            colvert.effectuerCancan();
            Canard leurre = new Leurre(new FakeCancan(), new NeSaisPasVoler());
            log.info("=================leurre");
            leurre.afficher();
            leurre.nager();
            leurre.effecturevol();
            leurre.effectuerCancan();
        };
    }

}

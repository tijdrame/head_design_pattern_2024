package com.emard.design.pattern.strategy.interf;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuackComportement implements ComportementCancan {

    @Override
    public void effectuerCancan() {
        log.info(("quack quack, je suis un vrai canard!!"));
    }

}

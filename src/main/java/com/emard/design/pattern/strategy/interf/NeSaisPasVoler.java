package com.emard.design.pattern.strategy.interf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NeSaisPasVoler implements ComportementVol {
    @Override
    public void effectuerVol() {
        log.info("Ne sait pas voler");
    }

}

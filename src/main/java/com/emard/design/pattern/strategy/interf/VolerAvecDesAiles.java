package com.emard.design.pattern.strategy.interf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VolerAvecDesAiles implements ComportementVol {

    @Override
    public void effectuerVol() {
        log.info("Voler avec des vrais ailes");
    }

}

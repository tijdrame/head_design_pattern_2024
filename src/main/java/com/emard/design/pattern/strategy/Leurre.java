package com.emard.design.pattern.strategy;

import com.emard.design.pattern.strategy.interf.ComportementCancan;
import com.emard.design.pattern.strategy.interf.ComportementVol;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
public class Leurre extends Canard {

    public Leurre(ComportementCancan comportementCancan, ComportementVol comportementVol) {
        super(comportementCancan, comportementVol);
    }
    @Override
    public void afficher() {
        log.info("Je suis un leurre.");
    }
}

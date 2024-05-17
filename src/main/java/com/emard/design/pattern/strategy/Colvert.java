package com.emard.design.pattern.strategy;

import com.emard.design.pattern.strategy.interf.ComportementCancan;
import com.emard.design.pattern.strategy.interf.ComportementVol;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Colvert extends Canard {

    public Colvert(ComportementCancan comportementCancan, ComportementVol comportementVol){
        super(comportementCancan, comportementVol);
    }

    @Override
    public void afficher() {
        log.info("Je m'affiche comme un canard");
    }
}

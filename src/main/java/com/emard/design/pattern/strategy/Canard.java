package com.emard.design.pattern.strategy;

import com.emard.design.pattern.strategy.interf.ComportementCancan;
import com.emard.design.pattern.strategy.interf.ComportementVol;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Canard {
    private final ComportementCancan comportementCancan;
    private final ComportementVol comportementVol;

    protected Canard(ComportementCancan comportementCancan, ComportementVol comportementVol){
        this.comportementVol = comportementVol;
        this.comportementCancan = comportementCancan;
    }
    public void effectuerCancan() {
        this.comportementCancan.effectuerCancan();
    }

    public void nager() {
        log.info("Je nage comme un canard");
    }

    public abstract void afficher();

    public void effecturevol() {
        this.comportementVol.effectuerVol();
    }
}

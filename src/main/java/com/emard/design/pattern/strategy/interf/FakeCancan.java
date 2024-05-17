package com.emard.design.pattern.strategy.interf;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FakeCancan implements ComportementCancan {
    @Override
    public void effectuerCancan() {
        log.info(("coin coin, je suis un leurre!!"));
    }
}

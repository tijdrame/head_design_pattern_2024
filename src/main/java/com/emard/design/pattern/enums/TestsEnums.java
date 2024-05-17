package com.emard.design.pattern.enums;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestsEnums {
    public static void main(String[] args) {
        CupSize cup = CupSize.MEDIUM;
        log.info("Value of cup: [{}] name: [{}]", cup.getVolume(), cup.name());
        Coffee coffee = new Coffee();
        coffee.setCupSize(cup);
        log.info("Coffe: [{}]", coffee);
        cup.getData();
    }
}

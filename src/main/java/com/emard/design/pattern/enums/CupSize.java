package com.emard.design.pattern.enums;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum CupSize {
    SMALL(25){
        @Override
        public void getData() {
            log.info("Iam a small cup");
        }
    },
    MEDIUM(40){
        @Override
        public void getData() {
            log.info("Iam a mediup cup");
        }
    },
    LARGE(110){
        @Override
        public void getData() {
            log.info("Iam a big cup");
        }
    };
    private int volume;
    CupSize(int volume){
        this.volume = volume;
    }

    public void getData(){
        log.info("DEFAULT");
    }
}

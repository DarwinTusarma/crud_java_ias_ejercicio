package com.crud.training.ias.ejercicio.crud.birds.aplication.domain;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs.*;

public class Bird {

    private final BirdId birdId;

    private final BirdCommonName birdCommonName;

    private final BirdScientistName birdScientistName;

    private final BirdQuantityConfirm birdQuantityConfirm;

    private final BirdZoneName birdZoneName;


    public Bird(BirdId birdId, BirdCommonName birdCommonName, BirdScientistName birdScientistName, BirdQuantityConfirm birdQuantityConfirm, BirdZoneName birdZoneName) {
        this.birdId = birdId;
        this.birdCommonName = birdCommonName;
        this.birdScientistName = birdScientistName;
        this.birdQuantityConfirm = birdQuantityConfirm;
        this.birdZoneName = birdZoneName;
    }

    public BirdId getBirdId() {
        return birdId;
    }

    public BirdCommonName getBirdCommonName() {
        return birdCommonName;
    }

    public BirdScientistName getBirdScientistName() {
        return birdScientistName;
    }

    public BirdQuantityConfirm getBirdQuantityConfirm() {
        return birdQuantityConfirm;
    }

    public BirdZoneName getBirdZoneName() {
        return birdZoneName;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "birdId=" + birdId +
                ", birdCommonName=" + birdCommonName +
                ", birdScientistName=" + birdScientistName +
                ", birdQuantityConfirm=" + birdQuantityConfirm +
                ", birdZoneName=" + birdZoneName +
                '}';
    }
}

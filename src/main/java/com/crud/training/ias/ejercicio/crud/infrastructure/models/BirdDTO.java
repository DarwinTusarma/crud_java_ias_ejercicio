package com.crud.training.ias.ejercicio.crud.infrastructure.models;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.Bird;
import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs.*;

public class BirdDTO {
    private Long birdId;
    private String birdCommonName;
    private String birdScientistName;
    private String birdZoneName;
    private int birdQuantityConfirm;

    public BirdDTO(Long birdId, String birdCommonName, String birdScientistName, String birdZoneName, Integer birdQuantityConfirm) {
        this.birdId = birdId;
        this.birdCommonName = birdCommonName;
        this.birdScientistName = birdScientistName;
        this.birdZoneName = birdZoneName;
        this.birdQuantityConfirm = birdQuantityConfirm;
    }

    public Bird toDomain(){
        return new Bird(
                new BirdId(birdId),
                new BirdCommonName(birdCommonName),
                new BirdScientistName(birdScientistName),
                new BirdQuantityConfirm(birdQuantityConfirm),
                new BirdZoneName(birdZoneName)
                );

    }

    public static BirdDTO fromDomain(Bird bird){
        BirdDTO birtDTO = new BirdDTO();
        birtDTO.setBirdId(bird.getBirdId().getValue());
        birtDTO.setBirdCommonName(bird.getBirdCommonName().getValue());
        birtDTO.setBirdScientistName(bird.getBirdScientistName().getValue());
        birtDTO.setBirdQuantityConfirm(bird.getBirdQuantityConfirm().getValue());
        return birtDTO;
    }

    public BirdDTO(){

    }

    public Long getBirdId() {
        return birdId;
    }

    public String getBirdCommonName() {
        return birdCommonName;
    }

    public String getBirdScientistName() {
        return birdScientistName;
    }

    public String getBirdZoneName() {
        return birdZoneName;
    }

    public int getBirdQuantityConfirm() {
        return birdQuantityConfirm;
    }

    public void setBirdId(Long birdId) {
        this.birdId = birdId;
    }

    public void setBirdCommonName(String birdCommonName) {
        this.birdCommonName = birdCommonName;
    }

    public void setBirdScientistName(String birdScientistName) {
        this.birdScientistName = birdScientistName;
    }

    public void setBirdZoneName(String birdZoneName) {
        this.birdZoneName = birdZoneName;
    }

    public void setBirdQuantityConfirm(int birdQuantityConfirm) {
        this.birdQuantityConfirm = birdQuantityConfirm;
    }
    public void setStatus(String updated) {
    }

    @Override
    public String toString() {
        return "BirtDTO{" +
                "birdId=" + birdId +
                ", birdCommonName='" + birdCommonName + '\'' +
                ", birdScientistName='" + birdScientistName + '\'' +
                ", birdZoneName='" + birdZoneName + '\'' +
                ", birdQuantityConfirm=" + birdQuantityConfirm +
                '}';
    }


}

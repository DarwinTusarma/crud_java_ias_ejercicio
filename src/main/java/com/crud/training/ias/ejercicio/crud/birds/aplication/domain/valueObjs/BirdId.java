package com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs;


import org.apache.commons.lang3.Validate;

public class BirdId {
    private final Long value;

    public BirdId(Long value){
        Validate.notNull(value, "The bird can't be null");
        this.value = value;
    }



    public Long getValue(){
        return value;
    }

    @Override
    public String toString() {
        return "BirdId{" +
                "value=" + value +
                '}';
    }

}

package com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class BirdQuantityConfirm {

    private final Integer value;



    public BirdQuantityConfirm(Integer value) {
        Validate.notNull(value, "quantity can't be null");
        Validate.isTrue(value.toString().length() <= 100000, "quantity can't be long to 100000");
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BirdQuantityConfirm{" +
                "value=" + value +
                '}';
    }
}

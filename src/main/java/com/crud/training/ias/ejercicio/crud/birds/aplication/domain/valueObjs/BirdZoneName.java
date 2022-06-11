package com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class BirdZoneName {

    private final String value;

    public BirdZoneName(String value) {
        Validate.notNull(value, "can't be null this value");
        Validate.isTrue(value.length() <= 20);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BirdZoneName{" +
                "value='" + value + '\'' +
                '}';
    }
}

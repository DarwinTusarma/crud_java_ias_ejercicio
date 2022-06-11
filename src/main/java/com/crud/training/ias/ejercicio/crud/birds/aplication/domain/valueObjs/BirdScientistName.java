package com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs;

import org.apache.commons.lang3.Validate;

public class BirdScientistName {

    private final String value;

    public BirdScientistName(String value) {
        Validate.notNull(value, "can be a null data");
        Validate.isTrue(value.length() <= 30, "Can't be a longer this value to 50");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BirdScientistName{" +
                "value='" + value + '\'' +
                '}';
    }
}

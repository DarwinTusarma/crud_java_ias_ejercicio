package com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs;

import com.crud.training.ias.ejercicio.crud.infrastructure.validations.Validation;
import org.apache.commons.lang3.Validate;

public class BirdCommonName {

    private final String value;

    public BirdCommonName(String value) {
        Validate.notNull(value, "common name can't b null");
        Validate.isTrue(value.length() <= 30, "The common name bird can't be too long");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "BirdCommonName{" +
                "value='" + value + '\'' +
                '}';
    }
}


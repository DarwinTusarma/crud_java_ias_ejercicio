package com.crud.training.ias.ejercicio.crud.commons;

public interface UseCase<Input, Ouput> {

    Ouput execute(Input input);
}

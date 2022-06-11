package com.crud.training.ias.ejercicio.crud.birds.aplication.post.input;

import com.crud.training.ias.ejercicio.crud.infrastructure.models.BirdDTO;

public interface QueryBirdByIdUseCase {
    BirdDTO execute(BirdDTO birdDTO);
}

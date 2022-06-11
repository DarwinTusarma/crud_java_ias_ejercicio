package com.crud.training.ias.ejercicio.crud.birds.aplication.post.ouput;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.Bird;
import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs.BirdId;

import java.util.Optional;

public interface BirdRepository {
    void wood(Bird bird);

    Optional<Bird> get(BirdId birdId);

    Optional<Bird> update(Bird bird);

    Boolean delete(BirdId birdId);
}

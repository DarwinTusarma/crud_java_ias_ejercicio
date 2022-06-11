package com.crud.training.ias.ejercicio.crud.birds.aplication.services;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.Bird;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.input.UpdateBirdUseCase;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.ouput.BirdRepository;
import com.crud.training.ias.ejercicio.crud.infrastructure.models.BirdDTO;

import java.util.Optional;

public class UpdateBirdService implements UpdateBirdUseCase {

    private final BirdRepository birdRepository;

    public UpdateBirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    @Override
    public BirdDTO execute(BirdDTO birdDTO) {
        Bird bird = birdDTO.toDomain();
        Optional<Bird> birdBD = birdRepository.get(bird.getBirdId());

        if(birdBD.isPresent()){
            birdRepository.update(bird);
            birdDTO.setStatus("updated");
        }else {
            birdDTO.setStatus("Not updated");
        }

        return birdDTO;
    }
}

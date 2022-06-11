package com.crud.training.ias.ejercicio.crud.birds.aplication.services;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.input.CreateBirdUseCase;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.ouput.BirdRepository;
import com.crud.training.ias.ejercicio.crud.infrastructure.models.BirdDTO;
import org.springframework.stereotype.Service;

@Service
public class CreateBirdService  implements CreateBirdUseCase {

    private final BirdRepository birdRepository;

    public CreateBirdService(BirdRepository birdRepository) {
        this.birdRepository = birdRepository;
    }

    @Override
    public BirdDTO execute(BirdDTO birdDTO) {
        return null;


    }
}

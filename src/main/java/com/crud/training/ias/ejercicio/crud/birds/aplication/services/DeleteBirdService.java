package com.crud.training.ias.ejercicio.crud.birds.aplication.services;

import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.Bird;
import com.crud.training.ias.ejercicio.crud.birds.aplication.domain.valueObjs.BirdId;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.input.DeleteBirdUseCase;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.ouput.BirdRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DeleteBirdService implements DeleteBirdUseCase {

    private final BirdRepository birdRepository;

    public DeleteBirdService(BirdRepository birdRepository){
        this.birdRepository = birdRepository;
    }
    @Override
    public Boolean execute(Long id){
        BirdId birdId = new BirdId(id);
        Optional<Bird> bird = birdRepository.get(birdId);

        if(bird.isPresent()){
            birdRepository.delete(birdId);
        }
        return bird.isPresent();
    }



}

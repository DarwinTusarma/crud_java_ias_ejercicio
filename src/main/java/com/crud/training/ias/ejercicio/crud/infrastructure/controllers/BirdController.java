package com.crud.training.ias.ejercicio.crud.infrastructure.controllers;

import com.crud.training.ias.ejercicio.crud.birds.aplication.post.input.CreateBirdUseCase;
import com.crud.training.ias.ejercicio.crud.birds.aplication.post.input.QueryBirdByIdUseCase;
import com.crud.training.ias.ejercicio.crud.infrastructure.models.ApplicationError;
import com.crud.training.ias.ejercicio.crud.infrastructure.models.BirdDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BirdController {

    private final CreateBirdUseCase createBirdUseCase;

    private final QueryBirdByIdUseCase queryBirdByIdService;

    public BirdController(CreateBirdUseCase createBirdUseCase, QueryBirdByIdUseCase queryBirdByIdService) {
        this.createBirdUseCase = createBirdUseCase;
        this.queryBirdByIdService = queryBirdByIdService;
    }

    @RequestMapping(value = "/birds", method = RequestMethod.POST)
    public ResponseEntity<?> createBird(@RequestBody BirdDTO birtDTO){
        try{
            BirdDTO birtDTOOuput = createBirdUseCase.execute(birtDTO);
            return ResponseEntity.ok(birtDTOOuput);

        }catch (NullPointerException | IllegalArgumentException e){
            ApplicationError applicationError = new ApplicationError( "InputDataValidationError", "Bad input Data",
                    Map.of("error", e.getMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(applicationError);
        }catch (Exception e){
            ApplicationError applicationError = new ApplicationError("SystemError", "try more later", Map.of());
            System.out.println("Error..." + e.getMessage());
            return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(applicationError);
        }
    }
}

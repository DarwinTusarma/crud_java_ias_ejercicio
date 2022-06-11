package com.crud.training.ias.ejercicio.crud.infrastructure.adapters.ouput;

import com.crud.training.ias.ejercicio.crud.birds.aplication.post.ouput.BirdRepository;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class PostgresSqlBirdRepository implements BirdRepository {

    private final DataSource dataSource;

    public PostgresSqlBirdRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }


}

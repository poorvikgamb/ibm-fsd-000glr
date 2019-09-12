package com.example.demo.bootstrap;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Receipe;

@Repository
public interface ReceipeRepository  extends CrudRepository<Receipe, Long>{

}

package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long>{

}

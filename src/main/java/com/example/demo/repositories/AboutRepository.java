package com.example.demo.repositories;

// import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.AboutModel;

@Repository
public interface AboutRepository extends CrudRepository<AboutModel, Long> {
   
    
}

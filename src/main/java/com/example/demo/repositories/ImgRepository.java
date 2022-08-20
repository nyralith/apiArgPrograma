package com.example.demo.repositories;

// import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.ImgModel;

@Repository
public interface ImgRepository extends CrudRepository<ImgModel, Long> {
   
    
}

package com.example.demo.repositories;

// import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.SkillsModel;

@Repository
public interface SkillsRepository extends CrudRepository<SkillsModel, Long> {
   
    
}

package com.example.demo.repositories;

// import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.LoginModel;

@Repository
public interface LoginRepository extends CrudRepository<LoginModel, Long> {
   
    
}

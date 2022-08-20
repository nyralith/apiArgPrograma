package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.EducationRepository;
import com.example.demo.models.EducationModel;

@Service
public class EducationService {
    @Autowired
    EducationRepository educationRepository;

    public ArrayList<EducationModel> obtenerEducacion(){
       return (ArrayList<EducationModel>) educationRepository.findAll();
    }

    public EducationModel guardarEducacion(EducationModel educacion){
        return educationRepository.save(educacion);
    };

    public Optional<EducationModel> obtenerPorId(Long id){
        return educationRepository.findById(id);
    }

    public boolean eliminarEducacion(Long id){
        try{
            educationRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

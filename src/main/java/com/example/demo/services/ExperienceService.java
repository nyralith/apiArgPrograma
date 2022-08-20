package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ExperienceRepository;
import com.example.demo.models.ExperienceModel;

@Service
public class ExperienceService {
    @Autowired
    ExperienceRepository experienceRepository;

    public ArrayList<ExperienceModel> obtenerExperiencias(){
       return (ArrayList<ExperienceModel>) experienceRepository.findAll();
    }

    public ExperienceModel guardarExperiencia(ExperienceModel experiencia){
        return experienceRepository.save(experiencia);
    };

    public Optional<ExperienceModel> obtenerPorId(Long id){
        return experienceRepository.findById(id);
    }

    public boolean eliminarExperiencia(Long id){
        try{
            experienceRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

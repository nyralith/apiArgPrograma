package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.SkillsRepository;
import com.example.demo.models.SkillsModel;

@Service
public class SkillsService {
    @Autowired
    SkillsRepository skillRepository;

    public ArrayList<SkillsModel> obtenerSkill(){
       return (ArrayList<SkillsModel>) skillRepository.findAll();
    }

    public SkillsModel guardarSkill(SkillsModel skill){
        return skillRepository.save(skill);
    };

    public Optional<SkillsModel> obtenerPorId(Long id){
        return skillRepository.findById(id);
    }

    public boolean eliminarSkill(Long id){
        try{
            skillRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

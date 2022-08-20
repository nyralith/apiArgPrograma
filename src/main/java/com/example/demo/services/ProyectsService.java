package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ProyectsRepository;
import com.example.demo.models.ProyectsModel;

@Service
public class ProyectsService {
    @Autowired
    ProyectsRepository proyectRepository;

    public ArrayList<ProyectsModel> obtenerProyectos(){
       return (ArrayList<ProyectsModel>) proyectRepository.findAll();
    }

    public ProyectsModel guardarProyecto(ProyectsModel proyecto){
        return proyectRepository.save(proyecto);
    };

    public Optional<ProyectsModel> obtenerPorId(Long id){
        return proyectRepository.findById(id);
    }

    public boolean eliminarProyecto(Long id){
        try{
            proyectRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

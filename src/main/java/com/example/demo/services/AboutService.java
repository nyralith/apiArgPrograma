package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.AboutRepository;
import com.example.demo.models.AboutModel;


@Service
public class AboutService {
    @Autowired
    AboutRepository aboutRepository;

    public ArrayList<AboutModel> obtenerAbout(){
       return (ArrayList<AboutModel>) aboutRepository.findAll();
    }

    public AboutModel guardarAbout(AboutModel about){
        return aboutRepository.save(about);
    };

    public Optional<AboutModel> obtenerPorId(Long id){
        return aboutRepository.findById(id);
    }

    public boolean eliminarAbout(Long id){
        try{
            aboutRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

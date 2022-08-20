package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.ImgRepository;
import com.example.demo.models.ImgModel;


@Service
public class ImgService {
    @Autowired
    ImgRepository ImgRepository;

    public ArrayList<ImgModel> obtenerImg(){
       return (ArrayList<ImgModel>) ImgRepository.findAll();
    }

    public ImgModel guardarImg(ImgModel Img){
        return ImgRepository.save(Img);
    };

    public Optional<ImgModel> obtenerPorId(Long id){
        return ImgRepository.findById(id);
    }

    public boolean eliminarImg(Long id){
        try{
            ImgRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

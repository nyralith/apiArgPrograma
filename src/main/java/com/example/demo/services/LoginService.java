package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.LoginRepository;
import com.example.demo.models.LoginModel;


@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;

    public ArrayList<LoginModel> obtenerlogin(){
       return (ArrayList<LoginModel>) loginRepository.findAll();
    }

    public LoginModel guardarlogin(LoginModel login){
        return loginRepository.save(login);
    };

    public Optional<LoginModel> obtenerPorId(Long id){
        return loginRepository.findById(id);
    }

    public boolean eliminarlogin(Long id){
        try{
            loginRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
    
}

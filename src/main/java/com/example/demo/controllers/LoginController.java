package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.LoginModel;
import com.example.demo.services.LoginService;


@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<LoginModel> obtenerlogin() {
        return loginService.obtenerlogin();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public LoginModel guardarlogin(@RequestBody LoginModel login) {
        return this.loginService.guardarlogin(login);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<LoginModel> obtenerPorId(@PathVariable("id")Long id){
        return this.loginService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.loginService.eliminarlogin(id);
        if(ok){
            return "Se elimino el usuario con id " + id;
        }else{
            return "Hubo un error al eliminar el usuario con id " + id;
        }
    }
}

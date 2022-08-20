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

import com.example.demo.models.AboutModel;
import com.example.demo.services.AboutService;


@RestController
@RequestMapping("/about")
public class AboutController {
    @Autowired
    AboutService aboutService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<AboutModel> obtenerAbout() {
        return aboutService.obtenerAbout();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public AboutModel guardarAbout(@RequestBody AboutModel about) {
        return this.aboutService.guardarAbout(about);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<AboutModel> obtenerPorId(@PathVariable("id")Long id){
        return this.aboutService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.aboutService.eliminarAbout(id);
        if(ok){
            return "Se elimino el about con id " + id;
        }else{
            return "Hubo un error al eliminar el about con id " + id;
        }
    }
}

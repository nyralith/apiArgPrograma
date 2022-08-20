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

import com.example.demo.models.ExperienceModel;
import com.example.demo.services.ExperienceService;

@RestController
@RequestMapping("/experiencia")
public class ExperienceController {
    @Autowired
    ExperienceService experienceService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<ExperienceModel> obtenerExperiencias() {
        return experienceService.obtenerExperiencias();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public ExperienceModel guardarExperiencia(@RequestBody ExperienceModel experiencia) {
        return this.experienceService.guardarExperiencia(experiencia);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<ExperienceModel> obtenerPorId(@PathVariable("id")Long id){
        return this.experienceService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.experienceService.eliminarExperiencia(id);
        if(ok){
            return "Se elimino la experiencia con id " + id;
        }else{
            return "Hubo un error al eliminar el usuario con id " + id;
        }
    }
    
}

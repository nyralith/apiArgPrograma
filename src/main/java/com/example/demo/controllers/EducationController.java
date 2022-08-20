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

import com.example.demo.models.EducationModel;
import com.example.demo.services.EducationService;


@RestController
@RequestMapping("/educacion")
public class EducationController {
    @Autowired
    EducationService educationService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<EducationModel> obtenerEducacion() {
        return educationService.obtenerEducacion();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public EducationModel guardarEducacion(@RequestBody EducationModel educacion) {
        return this.educationService.guardarEducacion(educacion);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<EducationModel> obtenerPorId(@PathVariable("id")Long id){
        return this.educationService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.educationService.eliminarEducacion(id);
        if(ok){
            return "Se elimino la educacion con id " + id;
        }else{
            return "Hubo un error al eliminar la educacion con id " + id;
        }
    }
}

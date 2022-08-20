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

import com.example.demo.models.ProyectsModel;
import com.example.demo.services.ProyectsService;

@RestController
@RequestMapping("/proyectos")
public class ProyectsController {
    @Autowired
    ProyectsService proyectService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<ProyectsModel> obtenerProyectos() {
        return proyectService.obtenerProyectos();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public ProyectsModel guardarProyecto(@RequestBody ProyectsModel proyecto) {
        return this.proyectService.guardarProyecto(proyecto);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<ProyectsModel> obtenerPorId(@PathVariable("id")Long id){
        return this.proyectService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.proyectService.eliminarProyecto(id);
        if(ok){
            return "Se elimino el proyecto con id " + id;
        }else{
            return "Hubo un error al eliminar el proyecto con id " + id;
        }
    }
    
}

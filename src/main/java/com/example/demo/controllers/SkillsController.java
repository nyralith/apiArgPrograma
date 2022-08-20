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

import com.example.demo.models.SkillsModel;
import com.example.demo.services.SkillsService;

@RestController
@RequestMapping("/skills")
public class SkillsController {
    @Autowired
    SkillsService skillService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<SkillsModel> obtenerSkills() {
        return skillService.obtenerSkill();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public SkillsModel guardarSkills(@RequestBody SkillsModel skill) {
        return this.skillService.guardarSkill(skill);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<SkillsModel> obtenerPorId(@PathVariable("id")Long id){
        return this.skillService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.skillService.eliminarSkill(id);
        if(ok){
            return "Se elimino la skillcon id " + id;
        }else{
            return "Hubo un error al la skill con id " + id;
        }
    }
    
}

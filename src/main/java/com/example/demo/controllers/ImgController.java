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

import com.example.demo.models.ImgModel;
import com.example.demo.services.ImgService;


@RestController
@RequestMapping("/img")
public class ImgController {
    @Autowired
    ImgService ImgService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ArrayList<ImgModel> obtenerImg() {
        return ImgService.obtenerImg();
    }
    @CrossOrigin(origins = "*")
    @PostMapping()
    public ImgModel guardarImg(@RequestBody ImgModel Img) {
        return this.ImgService.guardarImg(Img);
    }
    @CrossOrigin(origins = "*")
    @GetMapping( path = "/{id}")
    public Optional<ImgModel> obtenerPorId(@PathVariable("id")Long id){
        return this.ImgService.obtenerPorId(id);
    }
    @CrossOrigin(origins = "*")
    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.ImgService.eliminarImg(id);
        if(ok){
            return "Se elimino el Img con id " + id;
        }else{
            return "Hubo un error al eliminar el Img con id " + id;
        }
    }
}

package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "about")
public class AboutModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String descripcionuno;
    private String descripciondos;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setDescripcionUno(String descripcion) {
        this.descripcionuno = descripcion;
    }

    public String getDescripcionUno() {
        return descripcionuno;
    }

    public void setDescripcionDos(String descripcion) {
        this.descripciondos = descripcion;
    }

    public String getDescripcionDos() {
        return descripciondos;
    }

}
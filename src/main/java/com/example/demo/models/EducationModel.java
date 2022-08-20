package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "educacion")
public class EducationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String institucion;
    private String titulo;
    private String tiempo;
    private String inicio;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getinstitucion() {
        return institucion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setinicio(String inicio) {
        this.inicio = inicio;
    }

    public String getinicio() {
        return inicio;
    }
    
}
package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "Img")
public class ImgModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String imgUrl;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setimgUrl(String url) {
        this.imgUrl = url;
    }

    public String getimgUrl() {
        return imgUrl;
    }

}
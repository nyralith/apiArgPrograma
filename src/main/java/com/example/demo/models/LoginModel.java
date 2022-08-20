package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name = "login")
public class LoginModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;


    private String user;
    private String password;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setuser(String user) {
        this.user = user;
    }

    public String getuser() {
        return user;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public String getpassword() {
        return password;
    }

}
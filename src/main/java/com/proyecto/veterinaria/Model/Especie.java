package com.proyecto.veterinaria.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "especie")
public class Especie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especie")
    private Long id_especie;

    @Column(nullable = false)
    private String nombre_especie;


    //constructor

    public Especie() {
    }

    //getters y setters

    public Long getId_especie() {
        return id_especie;
    }

    public String getNombre_especie() {
        return nombre_especie;
    }

    public void setId_especie(Long id_especie) {
        this.id_especie = id_especie;
    }

    public void setNombre_especie(String nombre_especie) {
        this.nombre_especie = nombre_especie;
    }


    
}

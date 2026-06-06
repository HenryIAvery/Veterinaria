package com.proyecto.veterinaria.Model;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "tratamientos_vacunas")
public class Tratamientos_vacunas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tratamiento")
    private Long id_tratamiento;

    @Column(nullable = false)
    private LocalDate fecha_aplicacion;

    @Column()
    private LocalDate fecha_refuerzo; 

    @Column()
    private String dosis;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    

    public Tratamientos_vacunas() {
    }

    public Long getId_tratamiento() {
        return id_tratamiento;
    }

    public LocalDate getFecha_aplicacion() {
        return fecha_aplicacion;
    }

    public LocalDate getFecha_refuerzo() {
        return fecha_refuerzo;
    }

    public String getDosis() {
        return dosis;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setId_tratamiento(Long id_tratamiento) {
        this.id_tratamiento = id_tratamiento;
    }

    public void setFecha_aplicacion(LocalDate fecha_aplicacion) {
        this.fecha_aplicacion = fecha_aplicacion;
    }

    public void setFecha_refuerzo(LocalDate fecha_refuerzo) {
        this.fecha_refuerzo = fecha_refuerzo;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    
}
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
@Table(name = "hospitalizacion")
public class Hospitalizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hospitalizacion")
    private Long id_hospitalizacion;

    @Column(nullable = false)
    private LocalDate fecha_ingreso;

    @Column()
    private LocalDate fecha_alta; 

    @Column(columnDefinition = "TEXT")
    private String motivo;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    

    public Hospitalizacion() {
    }

    public Long getId_hospitalizacion() {
        return id_hospitalizacion;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public LocalDate getFecha_alta() {
        return fecha_alta;
    }

    public String getMotivo() {
        return motivo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setId_hospitalizacion(Long id_hospitalizacion) {
        this.id_hospitalizacion = id_hospitalizacion;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public void setFecha_alta(LocalDate fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    
}

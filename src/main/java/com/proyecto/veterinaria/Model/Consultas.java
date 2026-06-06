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
@Table(name = "consultas")
public class Consultas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Long id_Consulta;

    @Column(nullable = false)
    private LocalDate fecha;

    // Conservamos el columnDefinition = "TEXT" porque un diagnóstico puede ser muy largo
    @Column(nullable = false, columnDefinition = "TEXT")
    private String diagnostico;

    @Column(columnDefinition = "TEXT")
    private String observaciones; 

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private Animal animal;

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    

    public Consultas() {
    }

    public Long getId_Consulta() {
        return id_Consulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setId_Consulta(Long id_Consulta) {
        this.id_Consulta = id_Consulta;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    
}
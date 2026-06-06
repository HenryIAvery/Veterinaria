package com.proyecto.veterinaria.Model;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citas")
public class Citas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long id_Cita;

    @Column(nullable = false)
    private LocalDateTime fecha_hora;

    @Column()
    private String estado;

    @Column()
    private String ubicacion; 

    @ManyToOne
    @JoinColumn(name = "id_veterinario")
    private Veterinario veterinario;

    

    public Citas() {
    }

    public Long getId_Cita() {
        return id_Cita;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public String getEstado() {
        return estado;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setId_Cita(Long id_Cita) {
        this.id_Cita = id_Cita;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    
}
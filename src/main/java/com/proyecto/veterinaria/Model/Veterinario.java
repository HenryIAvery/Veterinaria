package com.proyecto.veterinaria.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "veterinarios")
public class Veterinario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVeterinario;

    @Column(nullable = false)
    private String nombres;

    @Column(nullable = false)
    private String especialidad;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuarios usuarios;

    

    public Veterinario() {
    }

    public Long getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Long idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
}
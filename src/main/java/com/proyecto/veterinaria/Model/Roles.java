package com.proyecto.veterinaria.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Long idRol;

    @Column(nullable = false)
    private String nombreRol;

    // Constructor vacio
    public Roles() {
    }

    // Getters y Setters
    public Long getIdRol() {
        return idRol;
    }

    public void setIdRol(Long id_rol) {
        this.idRol = id_rol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombre_rol) {
        this.nombreRol = nombre_rol;
    }

    
}

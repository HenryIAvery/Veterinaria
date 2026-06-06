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
@Table(name = "duenios")
public class Duenios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_duenio")
    private Long id_duenio;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String direccion_o_comunidad;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String correo;

    @OneToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuarios usuarios;

    public Duenios() {
    }

    public Long getId_duenio() {
        return id_duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion_o_comunidad() {
        return direccion_o_comunidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setId_duenio(Long id_duenio) {
        this.id_duenio = id_duenio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion_o_comunidad(String direccion_o_comunidad) {
        this.direccion_o_comunidad = direccion_o_comunidad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    
    }
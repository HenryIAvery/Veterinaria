package com.proyecto.veterinaria.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String correo;

    @Column(unique = true)
    private String codigoAcceso;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Roles roles;


    // Constructor vacio
    public Usuarios() {
    }


    public Long getId_usuario() {
        return id_usuario;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getCorreo() {
        return correo;
    }

    public String getCodigoAcceso() {
        return codigoAcceso;
    }


    public Roles getRoles() {
        return roles;
    }


    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCodigoAcceso(String codigoAcceso) {
        this.codigoAcceso = codigoAcceso;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    
}

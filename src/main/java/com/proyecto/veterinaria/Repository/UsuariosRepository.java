package com.proyecto.veterinaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.veterinaria.Model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
    // Con solo esta línea, Spring Boot ya sabe cómo guardar, borrar y buscar Usuarios.
    Usuarios findByCorreo(String correo);
}
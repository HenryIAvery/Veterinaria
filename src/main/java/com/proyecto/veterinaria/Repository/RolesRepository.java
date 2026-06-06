package com.proyecto.veterinaria.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.veterinaria.Model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
    Roles findByNombre_rol(String nombre_rol);
}

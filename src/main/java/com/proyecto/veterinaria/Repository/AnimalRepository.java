package com.proyecto.veterinaria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.veterinaria.Model.Animal;

@Repository

public interface AnimalRepository extends JpaRepository<Animal, Long>{
    
}

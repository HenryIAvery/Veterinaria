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

@Table(name = "animal")
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto-incrementable
    @Column(name = "id_animal")
    private Long id_animal;

    @Column(nullable = false)
    private String nombre_o_identificador;

    @Column()
    private LocalDate fecha_nacimiento;

    @Column(nullable = false)
    private String sexo;

    @Column()
    private String raza;

    @Column()
    private String color_pelaje;

    @Column(nullable = false)
    private boolean esterilizado;

    @Column()
    private Float peso_referencial;

    @Column()
    private String proposito_produccion;

    @ManyToOne
    @JoinColumn(name = "id_duenio", nullable = false)
    private Duenios duenios;

    @ManyToOne
    @JoinColumn(name = "id_especie", nullable = false)
    private Especie especie;

    //constructor vacio
    public Animal() {
    }

    public Long getId_animal() {
        return id_animal;
    }

    public String getNombre_o_identificador() {
        return nombre_o_identificador;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor_pelaje() {
        return color_pelaje;
    }

    public boolean isEsterilizado() {
        return esterilizado;
    }

    public Float getPeso_referencial() {
        return peso_referencial;
    }

    public String getProposito_produccion() {
        return proposito_produccion;
    }

    public Duenios getDuenios() {
        return duenios;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setId_animal(Long id_animal) {
        this.id_animal = id_animal;
    }

    public void setNombre_o_identificador(String nombre_o_identificador) {
        this.nombre_o_identificador = nombre_o_identificador;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor_pelaje(String color_pelaje) {
        this.color_pelaje = color_pelaje;
    }

    public void setEsterilizado(boolean esterilizado) {
        this.esterilizado = esterilizado;
    }

    public void setPeso_referencial(Float peso_referencial) {
        this.peso_referencial = peso_referencial;
    }

    public void setProposito_produccion(String proposito_produccion) {
        this.proposito_produccion = proposito_produccion;
    }

    public void setDuenios(Duenios duenios) {
        this.duenios = duenios;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }


    

 

    

}

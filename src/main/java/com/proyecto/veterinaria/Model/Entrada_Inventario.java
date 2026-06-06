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
@Table(name = "entradas_inventario")
public class Entrada_Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_entrada")
    private Long id_entrada;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private Integer cantidad_ingresada;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    

    public Entrada_Inventario() {
    }

    public Long getId_entrada() {
        return id_entrada;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Integer getCantidad_ingresada() {
        return cantidad_ingresada;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setId_entrada(Long id_entrada) {
        this.id_entrada = id_entrada;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCantidad_ingresada(Integer cantidad_ingresada) {
        this.cantidad_ingresada = cantidad_ingresada;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
}
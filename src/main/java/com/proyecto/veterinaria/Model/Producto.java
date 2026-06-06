package com.proyecto.veterinaria.Model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private Integer stock_actual;

    @Column()
    private String unidad_medida;

    @Column()
    private Double precio_actual;

    

    public Producto() {
    }

    public Long getId_producto() {
        return id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getStock_actual() {
        return stock_actual;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public Double getPrecio_actual() {
        return precio_actual;
    }

    public void setId_producto(Long id_producto) {
        this.id_producto = id_producto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock_actual(Integer stock_actual) {
        this.stock_actual = stock_actual;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public void setPrecio_actual(Double precio_actual) {
        this.precio_actual = precio_actual;
    }

    

    
}
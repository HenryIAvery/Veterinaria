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
@Table(name = "detalle_consumo")
public class Detalle_Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_detalle")
    private Long id_detalle;

    @Column(nullable = false)
    private Integer cantidad_usada;

    @Column(nullable = false)
    private Double precio_al_momento;

    @ManyToOne
    @JoinColumn(name = "id_consulta")
    private Consultas consultas;

    @ManyToOne
    @JoinColumn(name = "id_producto")
    private Producto producto;

    

    public Detalle_Consumo() {
    }

    public Long getId_detalle() {
        return id_detalle;
    }

    public Integer getCantidad_usada() {
        return cantidad_usada;
    }

    public Double getPrecio_al_momento() {
        return precio_al_momento;
    }

    public Consultas getConsultas() {
        return consultas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setId_detalle(Long id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setCantidad_usada(Integer cantidad_usada) {
        this.cantidad_usada = cantidad_usada;
    }

    public void setPrecio_al_momento(Double precio_al_momento) {
        this.precio_al_momento = precio_al_momento;
    }

    public void setConsultas(Consultas consultas) {
        this.consultas = consultas;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }


}
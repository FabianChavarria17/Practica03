package com.Practica03.dominio;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nombre_comun")
    private String nombreComun;

    @Column(name = "nombre_cientifico")
    private String nombreCientifico;

    @Column(name = "altura_promedio")
    private double alturaPromedio;

    @Column(name = "edad_aproximada")
    private int edadAproximada;

    @Column(name = "tipo_suelo")
    private String tipoSuelo;

    @Column(name = "pais_origen")
    private String paisOrigen;

    public Arbol() {
    }

    public Arbol(String nombreComun, String nombreCientifico, double alturaPromedio, int edadAproximada, String tipoSuelo, String paisOrigen) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.alturaPromedio = alturaPromedio;
        this.edadAproximada = edadAproximada;
        this.tipoSuelo = tipoSuelo;
        this.paisOrigen = paisOrigen;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Practica03.dominio;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "arbol")
public class Arbol implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String nombreComun;
    private String nombreCientifico;
    private double alturaPromedio;
    private int edadAproximada;
    private String tipoSuelo;
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

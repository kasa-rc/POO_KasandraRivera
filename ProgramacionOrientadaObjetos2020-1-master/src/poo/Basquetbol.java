/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Alumno
 */
public class Basquetbol{
    
    private String nombreEquipo;
    public int numeroJugador;
    public int puntos;

 
    public Basquetbol (){
    nombreEquipo = "Agaves";
    numeroJugador = 7;
    puntos = 17;
    }
    
    public Basquetbol (String nombreEquipo, int numeroJugador, int puntos){
    this.nombreEquipo = nombreEquipo;
    this.numeroJugador = numeroJugador;
    this.puntos = puntos;
    }

    public String getNombreEquipo(){
    return this.nombreEquipo;
    }

    /**
     * @param nombreEquipo the nombreEquipo to set
     */
    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
} 

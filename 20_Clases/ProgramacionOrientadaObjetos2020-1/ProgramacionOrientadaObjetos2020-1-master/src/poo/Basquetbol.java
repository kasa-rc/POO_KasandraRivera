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
    
    public String nombreEquipo;
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
} 

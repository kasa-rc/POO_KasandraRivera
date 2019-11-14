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
public class Cancion {
    
    public String nombre;
    public int numeroLista;
    public double duracion;

    public Cancion (){
    nombre = "Hijo de la luna";
    numeroLista = 7;
    duracion = 4.56;
    }
    
    public Cancion (String nombre, int numeroLista, double duracion){
    this.nombre = nombre;
    this.numeroLista = numeroLista;
    this.duracion = duracion;
    }     
} 


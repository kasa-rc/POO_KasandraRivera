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
public class Pintura{
    
    public String estilo ;
    public int año;
    public String nombre;

    public Pintura (){
    estilo = "Naturalismo";
    año = 1950;
    nombre = "Aroyos";
    }
    
    public Pintura (String estilo, int año, String nombre){
    this.estilo = estilo;
    this.año = año;
    this.nombre = nombre;
    }     
} 

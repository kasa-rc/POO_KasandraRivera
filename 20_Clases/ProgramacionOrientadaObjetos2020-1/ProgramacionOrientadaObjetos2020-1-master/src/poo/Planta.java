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
public class Planta{
    
    public String nombre;
    public String color;
    public String textura;

    public Planta (){
    nombre ="Orquidia";
    color = "Rojo";
    textura = "Aspero";
    }
    
    public Planta (String nombre, String color, String textura){
    this.nombre = nombre;
    this.color = color;
    this.textura = textura;
    }     
} 

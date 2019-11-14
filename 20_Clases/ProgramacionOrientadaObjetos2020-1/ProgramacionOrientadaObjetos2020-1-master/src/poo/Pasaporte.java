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
public class Pasaporte{
    
    public String nombre ;
    public int edad;
    public String nacionalidad;

    public Pasaporte (){
    nombre = "Felipe";
    edad = 19;
    nacionalidad = "Mexicano";
    }
    
    public Pasaporte (String nombre, int edad, String nacionalidad){
    this.nombre = nombre;
    this.edad = edad;
    this.nacionalidad = nacionalidad;
    }     
} 
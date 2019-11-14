/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 * Crear objetos
 * @author CRUZLEIJA
 */
public class Persona {
    
    public String nombre;
    public int edad;
    public double estatura;
  
    public Persona (){
    nombre="k";
    edad=0;
    estatura=0;
    }
    
    public Persona (String nombre, int edad, double estatura){
    this.nombre=nombre;
    this.edad=edad;
    this.estatura=estatura;
    }     
}


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
public class Carro {
    
    public String modelo;
    public int año;
    public String color;

    public Carro (){
    modelo ="GT";
    año = 1960;
    color = "Negro";
    }
    
    public Carro (String modelo, int año, String color){
    this.modelo = modelo;
    this.año = año;
    this.color = color;
    }     
} 

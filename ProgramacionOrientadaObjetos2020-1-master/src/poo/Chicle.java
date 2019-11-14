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
public class Chicle{
    
    public String sabor;
    public String color;
    public double masa;

    public Chicle (){
    sabor = "menta";
    color = "azul";
    masa= 0.800;
    }
    
    public Chicle (String sabor, String color, double masa){
    this.sabor = sabor;
    this.color = color;
    this.masa = masa;
    }     
} 


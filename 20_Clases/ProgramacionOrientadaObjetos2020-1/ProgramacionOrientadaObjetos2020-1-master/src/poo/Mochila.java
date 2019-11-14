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
public class Mochila {
    
    public String marca;
    public int compartimentos;
    public double precio;

    public Mochila (){
    marca ="E";
    compartimentos = 0;
    precio = 0;
    }
    
    public Mochila (String marca, int compartimentos, double precio){
    this.marca = marca;
    this.compartimentos = compartimentos;
    this.precio = precio;
    }     
} 

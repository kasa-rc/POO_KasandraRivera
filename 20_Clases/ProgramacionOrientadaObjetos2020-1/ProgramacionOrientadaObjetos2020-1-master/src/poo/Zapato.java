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
public class Zapato{
    
    public String marca ;
    public String color;
    public double talla;

    public Zapato (){
    marca = "Nike";
    color = "Blanco";
    talla = 3.5;
    }
    
    public Zapato (String marca, String color, double talla){
    this.marca = marca;
    this.color = color;
    this.talla = talla;
    }     
} 

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
public class Vestido {
    
    public String marca;
    public int talla;
    public double largo;

    public Vestido (){
    marca ="V";
    talla = 0;
    largo = 0;
    }
    
    public Vestido (String marca, int talla, double largo){
    this.marca = marca;
    this.talla = talla;
    this.largo = largo;
    }     
} 
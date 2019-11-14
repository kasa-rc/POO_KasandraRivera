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
public class Casa{
    
    public String color;
    public int numero;
    public double area;

    public Casa (){
    color = "Blanco";
    numero = 7;
    area = 37.14;
    }
    
    public Casa (String color, int numero, double area){
    this.color = color;
    this.numero = numero;
    this.area = area;
    }     
} 

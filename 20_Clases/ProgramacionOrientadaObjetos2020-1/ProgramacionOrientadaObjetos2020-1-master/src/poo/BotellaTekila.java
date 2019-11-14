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
public class BotellaTekila {
    
    public String nombre;
    public int año;
    public double cantidad;

    public BotellaTekila(){
    nombre ="BT";
    año = 0;
    cantidad = 0;
    }
    
    public BotellaTekila(String nombre, int año, double cantidad){
    this.nombre = nombre;
    this.año = año;
    this.cantidad = cantidad;
    }     
} 

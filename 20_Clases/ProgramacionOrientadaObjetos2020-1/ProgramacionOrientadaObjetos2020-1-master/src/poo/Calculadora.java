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
public class Calculadora {
    
    public String marca;
    public int numero;
    public double PI;

    public Calculadora (){
    marca = "CASIO";
    numero = 7;
    PI = 3.1416;
    }
    
    public Calculadora (String marca, int numero, double PI){
    this.marca = marca;
    this.numero = numero;
    this.PI = PI;
    }     
} 


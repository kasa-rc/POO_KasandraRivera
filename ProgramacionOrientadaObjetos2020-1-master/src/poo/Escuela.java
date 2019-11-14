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
public class Escuela {
    
    public String nombre;
    public int matricula;
    public double area;

    public Escuela (){
    nombre ="E";
    matricula = 0;
    area = 0;
    }
    
    public Escuela (String nombre, int matricula, double area){
    this.nombre = nombre;
    this.matricula = matricula;
    this.area = area;
    }     
} 

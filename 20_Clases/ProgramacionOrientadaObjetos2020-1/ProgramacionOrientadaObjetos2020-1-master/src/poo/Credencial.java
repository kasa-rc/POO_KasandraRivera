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
public class Credencial{
    
    public String nombre ;
    public String CURP;
    public String direccion;

    public Credencial (){
    nombre = "Nataly";
    CURP = "NRTL1950068ZKTRS";
    direccion = "Alamos sur";
    }
    
    public Credencial (String nombre, String CURP, String direccion){
    this.nombre = nombre;
    this.CURP = CURP;
    this.direccion = direccion;
    }     
} 

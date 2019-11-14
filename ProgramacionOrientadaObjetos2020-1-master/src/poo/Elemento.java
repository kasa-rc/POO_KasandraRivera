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

public class Elemento{
    
    public String nombre;
    public int numeroAtomico;
    public double masaAtomica;

    public Elemento (){
    nombre = "Potasio";
    numeroAtomico = 19;
    masaAtomica= 39.098;
    }
    
    public Elemento (String nombre, int numeroAtomico, double masaAtomica){
    this.nombre = nombre;
    this.numeroAtomico = numeroAtomico;
    this.masaAtomica = masaAtomica;
    }     
} 
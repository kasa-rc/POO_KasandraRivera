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
public class Celular {
    
    public String marca;
    public int app;
    public double memoria;

    public Celular (){
    marca ="C";
    app = 0;
    memoria = 0;
    }
    
    public Celular (String marca, int app, double memoria){
    this.marca = marca;
    this.app = app;
    this.memoria = memoria;
    }     
}
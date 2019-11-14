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
public class Libro{
    
    public String autor ;
    public int añoEd;
    public String titulo;

    public Libro (){
    autor ="K";
    añoEd = 1920;
    titulo = "Margarita Miller";
    }
    
    public Libro (String autor, int añoEd, String titulo){
    this.autor = autor;
    this.añoEd = añoEd;
    this.titulo = titulo;
    }     
} 
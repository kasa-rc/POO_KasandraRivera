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
public class Maestro extends Empleado {
    
    private double salario ;
    private String plaza;
    
    public Maestro() {
     
    }
    public Maestro (String nombre, int edad, double estatura, int numCuentaBancaria, int NSS, double salario, String plaza){
    super(nombre,edad,estatura,numCuentaBancaria,NSS);
    this.salario = salario;
    this.plaza = plaza;
    } 

    
    
     /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    /**
     * @return the plaza
     */
    public String getPlaza() {
        return plaza;
    }

    /**
     * @param plaza the Plaza to set
     */
    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    
} 

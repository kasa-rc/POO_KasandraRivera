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
public class Doctor extends Empleado{
    
    private double salario;
    private int ID;
    
    public Doctor(){
    salario = 0;
    ID = 0;
    }   
    public Doctor(String nombre, int edad, double estatura, int numCuentaBancaria, int NSS, double salario, int ID){
    	super(nombre,edad,estatura,numCuentaBancaria,NSS);
	this.salario = salario;
    	this.ID = ID;
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
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
  

} 
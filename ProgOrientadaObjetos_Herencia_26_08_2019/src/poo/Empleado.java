/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Empleado
 */
public class Empleado extends Persona {
    
    private int numCuentaBancaria;
    private int NSS;

    public Empleado(){
        
    } 
    public Empleado(String nombre, int edad, double estatura, int numCuentaBancaria, int NSS) {
    	super(nombre,edad,estatura);
    	this.numCuentaBancaria = numCuentaBancaria;
	this.NSS = NSS;
    }

    /**
     * @return the numCuentaBancaria
     */
    public int getNumCuentaBancaria() {
        return numCuentaBancaria;
    }

    /**
     * @param numCuentaBancaria the numCuentaBancaria to set
     */
    public void setNumCuentaBancaria(int numCuentaBancaria) {
        this.numCuentaBancaria = numCuentaBancaria;
    }

    /**
     * @return the NSS
     */
    public int getNSS() {
        return NSS;
    }

    /**
     * @param NSS the NSS to set
     */
    public void setNSS(int NSS) {
        this.NSS = NSS;
    }
   
} 


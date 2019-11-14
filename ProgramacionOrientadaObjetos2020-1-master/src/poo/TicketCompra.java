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
public class TicketCompra{
    
    public String concepto ;
    public int cantidad;
    public double precio;

    public TicketCompra (){
    concepto = "aceite";
    cantidad = 3;
    precio = 56.89;
    }
    
    public TicketCompra (String concepto, int cantidad, double precio){
    this.concepto = concepto;
    this.cantidad = cantidad;
    this.precio = precio;
    }     
} 
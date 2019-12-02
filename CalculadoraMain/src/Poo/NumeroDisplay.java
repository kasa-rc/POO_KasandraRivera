/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author Usuario
 */
public class NumeroDisplay {
    private String texto;
    private boolean negativo;
//-----------------Constructor por defecto-------------------    
    public NumeroDisplay() {
        this.texto = "";
        negativo = false;
    }
//-------Constructor que recibira el texto del JButton------
    public NumeroDisplay(String texto) {
        this.texto = texto;
        this.negativo = false;
    }
//____________________________________________________________
//----------------Metodos-------------------------------------    
    public void concatenar(String texto){
        this.setTexto(this.getTexto() + texto);   
    } 
    public double getValue(){
        double valor=new Double(this.getTexto());
        if (isNegativo()){
           return valor*-1;
        }
        return valor;
    }
//____________________________________________________________
//----------geters y seters para Texto y Negativo    
    /**
     * @return the texto
     */
    public String getTexto() {
        return texto;
    }
    /**
     * @param texto the texto to set
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    
    /**
     * @return the negativo
     */
    public boolean isNegativo() {  // == getNegativo()
        return negativo;
    }
    /**
     * @param negativo the negativo to set
     */
    public void setNegativo(boolean negativo) {
        this.negativo = negativo;
    }
}//Termino de la clase

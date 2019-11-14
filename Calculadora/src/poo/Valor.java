/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Usuario
 */
public class Valor {
    private int entrada1;
    private int entrada2;
//---------------------------------Constructor-------------------------------------
    public Valor() {
    }

    public Valor(int entrada1, int entrada2) {
        this.entrada1 = entrada1;
        this.entrada2 = entrada2;
    }
//------------------------------------Metodos-------------------------------------   
    // @return the entrada1
  
    public int getEntrada1() {
        return entrada1;
    }

    /**
     * @param entrada1 the entrada1 to set
     */
    public void setEntrada1(int entrada1) {
        this.entrada1 = entrada1;
    }
//______________________________________________________________________  
    // @return the entrada2
   
    public int getEntrada2() {
        return entrada2;
    }

    /**
     * @param entrada2 the entrada2 to set
     */
    public void setEntrada2(int entrada2) {
        this.entrada2 = entrada2;
    }
         
    
}

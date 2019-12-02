/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Display  extends JTextField  {
    private NumeroDisplay numero;

//----------------Constructor----------------------    
    public Display() {
        this.numero = new NumeroDisplay();
    }
// --------------Metodo-------------------------------    
    public void concatenar (String texto){
        this.numero.concatenar(texto);
        setText(this.numero.getTexto());
    }
// ---------- get y set para numero de tipo NumeroDisplay------
    /**
     * @return the numero
     */
    public NumeroDisplay getNumero() {
        return numero;
    }
    /**
     * @param numero the numero to set
     */
    public void setNumero(NumeroDisplay numero) {
        this.numero = numero;
    }
} // Termino de la clase

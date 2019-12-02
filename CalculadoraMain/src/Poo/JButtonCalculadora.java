/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class JButtonCalculadora  extends JButton {
        //Etiqueta (texto)
        //Tamaño
        //Color
    public JButtonCalculadora(String etiqueta, Dimension dim, Color color){
        super(etiqueta);
        setSize(dim);
        //Buscamos la forma en la que todos los botones tengan la misma dimension
        //Cambiar el tamaño
        //Cambiar el color
        Font aux = getFont();
        String fuente = aux.getName();
        int estilo = aux.getStyle();
        
        Font aux2 = new Font(fuente, estilo, 30);
        setFont(aux2);
        //setVisible(true);
        
        
        setBackground(color);
        //System.out.println();
        //Cambiar el color
        
        
        
        
        
// ______________________ otra forma _____________________       
//        super(etiqueta);
//        setSize(dim);
//        
//        Font aux = getFont();
//        setBackground(color);
//        String fuente = aux.getName();
//        int estilo = aux.getStyle();
//        Font aux2 = new Font(fuente, estilo, 30);
//        setFont(aux2);     
//______________________________________________________     




    } // Termino del constructor para cambiar la etiqueta, dimension y color
   
} // Termino de la clase

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import Poo.Display;
import Poo.JButtonCalculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;


public class ListenerVerdes implements ActionListener{

    private Display display; // declaramos una variable privada display de tipo Display (clase)
//--------------------Constructor--------------------------
    public ListenerVerdes(Display display) {
        this.display = display;
    }
//---------El unico metodo que tiene esta clase--------------        
    @Override
    public void actionPerformed(ActionEvent e) {
       JButtonCalculadora aux = (JButtonCalculadora) e.getSource(); // ve donde fue el evento
       
       // Si el eveneto fue el boton +/-  (lo sabemos gracias al .equals): 
       if (aux.getText().equals("+/-")){         
          if(display.getNumero().isNegativo())  //Verificamos si es negativo el nuemero que tenemos antes de presionar el +/-
          { // si resulta que es negativo    
              display.getNumero().setNegativo(false); // entra a la clase NumeroDisplay y le manda este numero negativo 
              // y el get.Numero lo imprime en el display como un numero de tipo display
              
              
          }else{ //si no; entonces el nuemero que tenemos antes de presionar el +/- es positivo
              display.getNumero().setNegativo(true); //  De igual manera se manda el numero positivo a la misma variable (llamada negativo por comodidad) 
          //y el get.Numero lo imprime en el display como un numero de tipo display
          }
          
        // De una manera u otra debe de imprimir el valor en el display en forma de Set.Texto -(lo que imprimira es lo que muestra getNumero de la clase Display
        // despues de aver sido evaluado en la clase NumeroDisplay en el metodo Value();  )- 
        
        // display.getNumero().concatenar(display.getNumero().getValue()+"");
        display.setText(display.getNumero().getValue()+"");
       }
       
       // Si no se Oprimio el boton +/- entonces:
       else{
           // Solo se ira concatenando lo que se tiene... Este metodo de Display recive el String texto del boton presionado
           // y le da el sig tratamiento -{ this.numero.concatenar(texto);
           // setText(this.numero.getTexto());  }-
           display.concatenar(aux.getText());
           
           // por ello despues de concatemnarlo -{   muestra naturalmente el valor que tiene/muestra getNumero en la clase display
           // despues de aver sido evaluado en la clase NumeroDisplay en el metodo Value();  }-  
           display.setText(display.getNumero().getValue()+""); 
           }
       }
    
      
       
}
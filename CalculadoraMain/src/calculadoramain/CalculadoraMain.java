/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramain;

import Poo.JButtonCalculadora;
import Poo.JFrameCalculadora;
import Poo.Display;
import Poo.NumeroDisplay;
import Poo.ListenerVerdes;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;


/**
 *
 * @author Usuario
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        JButtonCalculadora aux = new JButtonCalculadora("3", new Dimension(50, 50), Color.PINK);
//        JButtonCalculadora aux2 = new JButtonCalculadora("4", new Dimension(50, 50), Color.PINK);
//        JFrame f = new JFrame("Prueba");
//        f.setSize(500, 500);
//        f.add(aux);
//        f.add(aux2);
//        f.setVisible(true);
        
        JFrameCalculadora c = new JFrameCalculadora();
        //JFrame c = new JFrame("Prueba");
        c.setSize(500, 500);        
        c.setVisible(true);
        
        
        
    }
    
}

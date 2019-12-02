/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

import static com.sun.javafx.fxml.expression.Expression.add;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class JFrameCalculadora extends JFrame{
    public JFrameCalculadora(){
        inicializarComponentes();
        //Parte Central
        
    }

    private void inicializarComponentes() {
        JPanel panelCentral = new JPanel(new GridLayout(5, 4));
        Dimension dim = new Dimension();
        JButtonCalculadora btnC = new JButtonCalculadora("C", dim, Color.yellow);
        JButtonCalculadora btnCE = new JButtonCalculadora("CE", dim, Color.yellow);
        JButtonCalculadora btnMasMen = new JButtonCalculadora("+/-", dim, Color.GREEN);
        JButtonCalculadora btnProduct = new JButtonCalculadora("X", dim, Color.GRAY);
        JButtonCalculadora btn7 = new JButtonCalculadora("7", dim, Color.GREEN);
        JButtonCalculadora btn8 = new JButtonCalculadora("8", dim, Color.GREEN);
        JButtonCalculadora btn9 = new JButtonCalculadora("9", dim, Color.GREEN);
        JButtonCalculadora btnDiv = new JButtonCalculadora("/", dim, Color.GRAY);
        JButtonCalculadora btn4 = new JButtonCalculadora("4", dim, Color.GREEN);
        JButtonCalculadora btn5 = new JButtonCalculadora("5", dim, Color.GREEN);
        JButtonCalculadora btn6 = new JButtonCalculadora("6", dim, Color.GREEN);
        JButtonCalculadora btnMenos = new JButtonCalculadora("-", dim, Color.GRAY);
        JButtonCalculadora btn1 = new JButtonCalculadora("1", dim, Color.GREEN);
        JButtonCalculadora btn2 = new JButtonCalculadora("2", dim, Color.GREEN);
        JButtonCalculadora btn3 = new JButtonCalculadora("3", dim, Color.GREEN);
        JButtonCalculadora btnMas = new JButtonCalculadora("+", dim, Color.GRAY);
        JButtonCalculadora btnCero = new JButtonCalculadora("0", dim, Color.GREEN);
        JButtonCalculadora btnPunto = new JButtonCalculadora(".", dim, Color.yellow);
        JButtonCalculadora btnIgual = new JButtonCalculadora("=", dim, Color.GRAY);
        JButtonCalculadora btnAcerca = new JButtonCalculadora("?", dim, Color.yellow);
        
        
        panelCentral.add(btnC);
        panelCentral.add(btnCE);
        panelCentral.add(btnMasMen);
        panelCentral.add(btnProduct);
        panelCentral.add(btn7);
        panelCentral.add(btn8);
        panelCentral.add(btn9);
        panelCentral.add(btnDiv);
        panelCentral.add(btn4);
        panelCentral.add(btn5);
        panelCentral.add(btn6);
        panelCentral.add(btnMenos);
        panelCentral.add(btn1);
        panelCentral.add(btn2);
        panelCentral.add(btn3);
        panelCentral.add(btnMas);
        panelCentral.add(btnCero);
        panelCentral.add(btnPunto);
        panelCentral.add(btnIgual);
        panelCentral.add(btnAcerca);
        
        setLayout(new BorderLayout());  
        // add es para agregar a la ventada cualquer componente o metodo
        // en este caso agregamos el panelCentral (es decir todos los componentes con sus respectivos colores)
        // ya que los agregamos como panelCEntral.add(btnMas);...etc
        add(panelCentral, BorderLayout.CENTER);
        
        //Font ---?
        Display display = new Display(); //Creo el campo para visualizar las operaciones y el resultado
        Font auxF = display.getFont(); //Font----?
        Font nueva = new Font(auxF.getName(), auxF.getStyle(),50);
        display.setFont(nueva); 
        display.setEditable(false); //--Segun yo para que no se pueda escribir en ella solo se mostrarian cosas
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display,BorderLayout.NORTH);
        
        ListenerVerdes orejon = new ListenerVerdes(display);
        btnMasMen.addActionListener(orejon);
        btn7.addActionListener(orejon);
        btn8.addActionListener(orejon);
        btn9.addActionListener(orejon);    
        btn4.addActionListener(orejon);
        btn5.addActionListener(orejon);
        btn6.addActionListener(orejon);
        btn1.addActionListener(orejon);
        btn2.addActionListener(orejon);
        btn3.addActionListener(orejon);
        btnCero.addActionListener(orejon);
        ListenersGrises orejon2 = new ListenersGrises(display);
        btnC.addActionListener(orejon2);
        btnCE.addActionListener(orejon2);
        btnDiv.addActionListener(orejon2);
        btnProduct.addActionListener(orejon2);
        btnMenos.addActionListener(orejon2);
        btnMas.addActionListener(orejon2);
         btnPunto.addActionListener(orejon2);
        btnIgual.addActionListener(orejon2);
        btnAcerca.addActionListener(orejon2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }    
}       
        
        
        
        
        
        
//      
//   //________intento 1___no muy viable_____________________________________________________
//        ActionListener escuchador = new ActionListener(){
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent ae) {
////                display.setText(btn1.getText());
//                int array[] = new int [30];
//                  if(ae.getSource()==btn1){
//                    display.setText(btn1.getText());
//                  array[0] = 1;  
//                  }
//                  if(ae.getSource()==btn2){
//                    display.setText(btn2.getText());
//                  }
//                 if(ae.getSource()==btn3){
//                    display.setText(btn3.getText());
//                  }
//                  if(ae.getSource()==btn4){
//                    display.setText(btn4.getText());
//                  }
//                  if(ae.getSource()==btn5){
//                    display.setText(btn5.getText());
//                  }
//                  if(ae.getSource()==btn6){
//                    display.setText(btn6.getText());
//                  }
//                  if(ae.getSource()==btn7){
//                    display.setText(btn7.getText());
//                  }
//                  if(ae.getSource()==btn8){
//                    display.setText(btn8.getText());
//                  }
//                  if(ae.getSource()==btn9){
//                    display.setText(btn9.getText());
//                  }
//                  if(ae.getSource()==btnCero){
//                    display.setText(btnCero.getText());
//                  }               
//            }//Termina la implementacion del metodo
//        }; //Termina la isntancia
//_______________________________________________________________________________
//----------------- intento 2_ funcional pero no el necesario--------------------      
//        ActionListener escuchador1 = new ActionListener(){
//            @Override
//            public void actionPerformed(java.awt.event.ActionEvent e) {              
//                if(e.getActionCommand() == "1"){ 
//                    display.setText(display.getText()+1);
//                } 
//                if(e.getActionCommand() == "2"){
//                    display.setText(display.getText()+2);
//                }
//                if(e.getActionCommand() == "3"){
//                    display.setText(display.getText()+3);
//                }
//                if(e.getActionCommand() == "4"){
//                    display.setText(display.getText()+4);
//                }
//                if(e.getActionCommand() == "5"){
//                    display.setText(display.getText()+5);
//                }
//                if(e.getActionCommand() == "6"){
//                    display.setText(display.getText()+6);
//                }
//                if(e.getActionCommand() == "7"){
//                    display.setText(display.getText()+7);
//                }
//                if(e.getActionCommand() == "8"){
//                    display.setText(display.getText()+8);
//                }
//                if(e.getActionCommand() == "9"){
//                    display.setText(display.getText()+9);
//                }
//                if(e.getActionCommand() == "0"){
//                    display.setText(display.getText()+0);
//                }
//                if(e.getActionCommand() == "+"){
//                    display.getText();
//                    //ObtenerPreresultado(display);
//                    System.out.println(display.getText());
//                }
//           }
//            private void ObtenerPreresultado(JTextField display) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//        };
//      
//        btn1.addActionListener(escuchador1);
//        btn2.addActionListener(escuchador1);
//        btn3.addActionListener(escuchador1);
//        btn4.addActionListener(escuchador1);
//        btn5.addActionListener(escuchador1);
//        btn6.addActionListener(escuchador1);
//        btn7.addActionListener(escuchador1);
//        btn8.addActionListener(escuchador1);
//        btn9.addActionListener(escuchador1);
//        btnCero.addActionListener(escuchador1);
//                
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
//    }
//    private void setLayout(BorderLayout borderLayout) {
//    }
//}

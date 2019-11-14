
package botones_de_colores;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class JFrame_Colores extends JFrame {
    public JFrame_Colores(){
        inicializarComponentes();
        //Parte Central   
    }
        private void inicializarComponentes() {
            JPanel panelCentral = new JPanel(new GridLayout(4, 4)); //filas columnas
            //JPanel panelAbajo = new JPanel(new GridLayout(1, 1)); 
            Dimension dim = new Dimension();
            //panelAbajo.setLayout(null);
            //this.getContentPane().add(panelAbajo);
            
            JButton_Colores btnA = new JButton_Colores("A", dim, Color.CYAN);
            JButton_Colores btnB = new JButton_Colores("B", dim, Color.CYAN);
            JButton_Colores btnC = new JButton_Colores("C", dim, Color.CYAN);
            JButton_Colores btnD = new JButton_Colores("D", dim, Color.CYAN);
            JButton_Colores btnE = new JButton_Colores("E", dim, Color.CYAN);
            JButton_Colores btnF = new JButton_Colores("F", dim, Color.CYAN);
            JButton_Colores btnG = new JButton_Colores("G", dim, Color.CYAN);
            JButton_Colores btnH = new JButton_Colores("H", dim, Color.CYAN);
            JButton_Colores btnI = new JButton_Colores("I", dim, Color.CYAN);
            JButton_Colores btnJ = new JButton_Colores("J", dim, Color.CYAN);
            JButton_Colores btnK = new JButton_Colores("K", dim, Color.CYAN);
            JButton_Colores btnL = new JButton_Colores("L", dim, Color.CYAN);
            JButton_Colores btnHola = new JButton_Colores("Hola", dim, Color.CYAN);
            panelCentral.add(btnA);
            panelCentral.add(btnB);
            panelCentral.add(btnC);
            panelCentral.add(btnD);
            panelCentral.add(btnE);
            panelCentral.add(btnF);
            panelCentral.add(btnG);
            panelCentral.add(btnH);
            panelCentral.add(btnI);
            panelCentral.add(btnJ);
            panelCentral.add(btnK);
            panelCentral.add(btnL);
            panelCentral.add(btnHola);
            //btnHola.setBounds(50, 50, 50, 30);
            
            setLayout(new BorderLayout());  
            add(panelCentral, BorderLayout.CENTER);
            add(btnHola, BorderLayout.NORTH);
            
            Listeners_Colores cambioDeColor = new Listeners_Colores();
            btnA.addActionListener(cambioDeColor);
            btnB.addActionListener(cambioDeColor);
            btnC.addActionListener(cambioDeColor);
            btnD.addActionListener(cambioDeColor);
            btnE.addActionListener(cambioDeColor);
            btnF.addActionListener(cambioDeColor);
            btnG.addActionListener(cambioDeColor);
            btnH.addActionListener(cambioDeColor);
            btnI.addActionListener(cambioDeColor);
            btnJ.addActionListener(cambioDeColor);
            btnK.addActionListener(cambioDeColor);
            btnL.addActionListener(cambioDeColor);
            btnHola.addActionListener(cambioDeColor);
       
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        } 
}

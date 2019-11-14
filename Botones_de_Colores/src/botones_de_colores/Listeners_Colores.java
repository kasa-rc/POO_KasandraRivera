
package botones_de_colores;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class Listeners_Colores implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton_Colores aux = (JButton_Colores) e.getSource();
        String respuesta = "Jajaja";
       
        if(aux.getBackground()== Color.CYAN){
            aux.setBackground(Color.yellow);
        }else{
           aux.setBackground(Color.CYAN); 
        }
       
//        if(aux.getText().equals("Hola")){
//            if(aux.getBackground()== Color.CYAN){
//                aux.setText(respuesta);
//            }    
//        }else{
//            aux.setText("Hola");
//        }
//        
     }  
}

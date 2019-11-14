package botones_de_colores;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
/**
 *
 * @author Usuario
 */
public class JButton_Colores  extends JButton {
                    //Etiqueta (texto) - Tamaño - Color
    public JButton_Colores(String etiqueta, Dimension dim, Color color){
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
        
    } // Termino del constructor para cambiar la etiqueta, dimension y color  
} // Termino de la clase

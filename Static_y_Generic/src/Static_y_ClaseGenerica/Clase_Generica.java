/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static_y_ClaseGenerica;

/**
 *
 * @author Usuario
 */
public class Clase_Generica <T> { // <T> me indica que es una clase generica porque sera del tipo de dato que yo le mande
    T atrib; //Le indico al atributo que sera del tipo T (del que yo le indique cuando instancie o lo haga objeto... a la clase)
    
    //---En el contructor le indico que mi varieble atributo de tipo T(generica) tomara tomara lo que tenga parametro
    public Clase_Generica(T parametro){ 
        atrib = parametro; // Sea el tipo de dato que sea paarmetro sera copiado en atributo
    }
    //---El metodo Tipo_Clase mostrara el tipo de dato que es atributo  
    public void Tipo_Clase(){   
        System.out.println("El tipo de dato es: "+atrib.getClass().getName());//Por medio del nombre de nuestro atributo
        // invocamos al metodo getClass()... este metodo nos devuelve en tiempo de dejecucion una representacion de la clase
    }
}

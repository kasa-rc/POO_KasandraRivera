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
public class MainStatic {
    int x;
    static int aux;
    
    public MainStatic(int x, int b){
        this.x = x;
        aux = b;
    }
    public static void main(String[] args){
    //----------------------------- static -----------------------------------------
        MainStatic a = new MainStatic(7,3);
        System.out.println(a.x); System.out.println(a.aux);
        MainStatic b = new MainStatic(9,8);
        System.out.println(a.x); System.out.println(a.aux);
    //------------------ static Contador de Intsnacias --------------------------  
    Static_Cont_de_Instancias cont1 = new Static_Cont_de_Instancias();
    Static_Cont_de_Instancias cont2 = new Static_Cont_de_Instancias();
    Static_Cont_de_Instancias cont3 = new Static_Cont_de_Instancias();
    Static_Cont_de_Instancias cont4 = new Static_Cont_de_Instancias();
    Static_Cont_de_Instancias cont5 = new Static_Cont_de_Instancias();
    System.out.println(Static_Cont_de_Instancias.cont);
    Static_Cont_de_Instancias cont6 = new Static_Cont_de_Instancias();
    Static_Cont_de_Instancias cont7 = new Static_Cont_de_Instancias();
    System.out.println( Static_Cont_de_Instancias.cont);
    
    //-----------------------------Clase Generica---------------------------------
    Clase_Generica <String> StringObj = new Clase_Generica <String>("Hola");
    StringObj.Tipo_Clase();
    Clase_Generica <Integer> IntegerObj = new Clase_Generica <Integer>(7);
    IntegerObj.Tipo_Clase();
    Clase_Generica <Double> DoubleObj = new Clase_Generica <Double>(7.8);
    DoubleObj.Tipo_Clase();
    
    
    //String e Integer son tipo Class... int es un tipo de dato primitivo asi que no podemos trattarlo como objeto
//    Clase_Generica <int> intObj = new Clase_Generica <int>(7);
//    intObj.Tipo_Clase();  //Marca error

//Solo se pueden usar Integer, String, Double que son clases... asi pueden llamar a metodos cuando los usemos en obtejos al instanciarlos
    }
}

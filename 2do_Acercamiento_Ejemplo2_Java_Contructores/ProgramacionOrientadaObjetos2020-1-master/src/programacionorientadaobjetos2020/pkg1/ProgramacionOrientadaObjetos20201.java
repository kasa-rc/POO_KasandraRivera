/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacionorientadaobjetos2020.pkg1;

import poo.Persona;

/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos20201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona beto = new Persona("Roberto", 18, 1.87, 45.5, "femenino" );
        beto.nombre = "Alberto";
        beto.edad = 17;
        beto.estatura = 1.50;
        beto.peso = 30.8;
        beto.sexo = "Masculino";
        System.out.println(); /*para depurar*/
    }
    
}

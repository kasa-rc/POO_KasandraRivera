/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramacionOrientadaObjetos_Herencia_26_08_2019_;

import poo.Persona;
import poo.Empleado;
import poo.Maestro;
import poo.Doctor;


/**
 *
 * @author CRUZLEIJA
 */
public class ProgramacionOrientadaObjetos_Herencia_26_08_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

	        Persona x = new Persona();
	x.setNombre("Alberto");
        System.out.println(x.getNombre());
        x.setEdad(17);
        System.out.println(x.getEdad());
	x.setEstatura(177.98);
        System.out.println(x.getEstatura());        
  
		Empleado emp = new Empleado();
	emp.setNumCuentaBancaria(768646993);
        System.out.println(emp.getNumCuentaBancaria());
	emp.setNSS(7565548);
        System.out.println(emp.getNSS());
        

        	Maestro Miss = new Maestro();
        Miss.setSalario(6578.08);
        System.out.println(Miss.getSalario());
        Miss.setPlaza("14BJerez32");
        System.out.println(Miss.getPlaza());
       
		Doctor doc = new Doctor();
        doc.setSalario(13789.9);
	System.out.println(doc.getSalario());
        doc.setID(17);
	System.out.println(doc.getID());
        

	System.out.println(); /*para depurar*/
    }

}

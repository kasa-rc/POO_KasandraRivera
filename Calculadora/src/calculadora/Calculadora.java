/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import poo.Operador;
import poo.Valor;

/**
 *
 * @author Usuario
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Valor va = new Valor();
          va.setEntrada1(3);
          va.setEntrada2(4);
       
       Operador op = new Operador();
          op.setSuma(0,va.getEntrada1(),va.getEntrada2());
       System.out.println(op.getSuma());
          op.setResta(0,va.getEntrada1(),va.getEntrada2());
       System.out.println(op.getResta());
          op.setMultipli(0,va.getEntrada1(),va.getEntrada2());
       System.out.println(op.getMultipli());
          op.setDivision(0,va.getEntrada1(),va.getEntrada2());
       System.out.println(op.getDivision());
    }
    
}

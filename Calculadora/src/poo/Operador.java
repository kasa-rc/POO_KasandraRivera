/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
/**
 *
 * @author Usuario
 */
public class Operador extends Valor {
    private int suma;
    private int resta;
    private int multipli;
    private float division;
//--------------------------------Constructor------------------------------------
    public Operador() {
    }
    
    public Operador(int entrada1, int entrada2, int suma, int resta, int multipli, float division) {
        super(entrada1, entrada2);
        this.suma = suma;
        this.resta = resta;
        this.multipli = multipli;
        this.division = division;
    }
//-----------------------------------Metodos---------------------------------------
    // @return the suma
    public int getSuma() {
        return suma;
    }

    /*** @param suma the suma to set
       * @param entrada1
       * @param entrada2   */
    public void setSuma(int suma, int entrada1, int entrada2) {
      
        suma = (entrada1 + entrada2);
         this.suma = suma;
    }
//______________________________________________________________________      
    // @return the resta
   
    public int getResta() {
        return resta;
    }
    /*** @param resta the suma to set
       * @param entrada1
       * @param entrada2   */
    public void setResta(int resta, int entrada1, int entrada2) {
        resta = entrada1 - entrada2;
        this.resta = resta;
    }
//______________________________________________________________________    
    // @return the multipli

    public int getMultipli() {
        return multipli;
    }

     /*** @param multipli the suma to set
       * @param entrada1
       * @param entrada2   */
    public void setMultipli(int multipli, int entrada1, int entrada2) {
        multipli = entrada1 * entrada2; 
        this.multipli = multipli;
    }
//______________________________________________________________________  
    // @return the division
      
    public float getDivision() {
        return division;
    }

     /*** @param division the suma to set
       * @param entrada1
       * @param entrada2   */
    public void setDivision(float division, int entrada1, int entrada2) {
        division = entrada1 / entrada2;
        this.division = division;
    }
    
    
}

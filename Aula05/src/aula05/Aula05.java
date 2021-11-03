/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ContaBancaria c1 = new ContaBancaria();
       
       c1.setnumConta(111);
       c1.setDono("Jubileu");
       c1.abrirConta("CC");
       //c1.sacar(50);
      // c1.pagarMensalidade();
       
       c1.infoConta();
     
        
        
        
    }
    
}

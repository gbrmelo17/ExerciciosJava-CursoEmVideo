/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author Gabriel
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        
        
        c1.tampar();
        c1.rabiscar();
        c1.status();
        
        System.out.println(" ");
        Caneta c2 = new Caneta();
        c2.modelo = "hostnet";
        c2.cor = "preta";
        c2.destampar();
        c2.rabiscar();
        c1.status();
        
        
    }
    
}

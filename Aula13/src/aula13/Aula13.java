/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13;

/**
 *
 * @author Gabriel
 */
public class Aula13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        Mamifero m = new Mamifero();
       //m.emitirSom();
        //c.emitirSom();
        //l.emitirSom();
        
        System.out.println("");
        
        c.reagir("Ola");
        c.reagir("Vai apanhar");
        c.reagir(11,45);
        c.reagir(21, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f );
    }
    
}

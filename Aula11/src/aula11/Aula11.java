/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11;

/**
 *
 * @author Gabriel
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa(); -> da erro em  instanciar porque a classe pessoa eh do tipo abstrato
        Visitante p2 = new Visitante();
        Aluno p3 = new Aluno();
        Bolsista p4 = new Bolsista();
        
        p3.pagarMensalidade();
        p4.pagarMensalidade();
    }
    
}

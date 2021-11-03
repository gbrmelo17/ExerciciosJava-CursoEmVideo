/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Gabriel
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caneta c1 = new Caneta("NIC", "Amarela", 0.6f);
        c1.setModelo("COMPACTOR");
        
       // c1.setModelo("BIC"); // metodo assessor
        //c1.modelo = "BIC"; da erro pos tenta acessar o assessar o atributo(privado) diretamente
                
       // c1.setPonta(0.5f);
       // c1.ponta = 0.5f;
        
        c1.status();
       // System.out.println("Tenho uma caneta "+ c1.getModelo()+" de ponta "+ c1.getPonta());
    }
    
}

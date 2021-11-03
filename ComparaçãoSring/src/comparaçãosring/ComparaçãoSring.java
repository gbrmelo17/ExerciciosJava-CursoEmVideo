/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaçãosring;

/**
 *
 * @author Gabriel
 */
public class ComparaçãoSring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo"; // a string nome3 tem um formato diferente da nome1 e nome2
        String nome2 = "Gustavo"; // mas tem o mesmo conteudo
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1 == nome3)?"igual":"diferente"; // verifica se sao do mesmo tipo 
        res = (nome1.equals(nome3))?"igual":"diferente"; // verifica se tem o mesmo conteudo, utilizado para objetos
        System.out.println(res);
        
    }
    
}

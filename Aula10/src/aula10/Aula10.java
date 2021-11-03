/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10;

/**
 *
 * @author Gabriel
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();
       
       p1.setNome("Joao");
       p2.setNome("Pedro"); // p2 é um objeto do tipo Aluno mas
                            // recebe as funcinaliadades da clase
                            // Pessoa por herença.
       p2.setIdade(22);
       p2.fazerAniver();
       System.out.println(p2.toString());
       
        
        
    }
    
}

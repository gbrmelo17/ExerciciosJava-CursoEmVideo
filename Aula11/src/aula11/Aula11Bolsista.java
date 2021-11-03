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
public class Bolsista extends Aluno{
    private int bolsa;
    
    public void renovarBolsa(){
        System.out.println("Bolsa renovada com sucesso");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade paga com desconto!");
    }
    
    public int getBolsa(){
        return this.bolsa;
    }
    
    public void setBolsa(int b){
        this.bolsa = b;
    }
}

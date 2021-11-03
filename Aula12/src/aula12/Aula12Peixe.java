/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12;

/**
 *
 * @author Gabriel
 */
public class Peixe extends Animal {
    private String corEscama;
    
    public void soltarBolha(){
        System.out.println("O peixe soltou bolhas!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo substancias");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Peixe nao faz som");
    }
    
    public String getCorEscama(){
        return this.corEscama;
    }
    
    public void setCorEscama(String c){
        this.corEscama = c;
    }
}

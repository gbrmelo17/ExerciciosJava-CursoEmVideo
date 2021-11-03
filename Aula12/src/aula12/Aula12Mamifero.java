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
public class Mamifero extends Animal {
    private String corPelo;
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando"); 
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de Mamifero");
    }
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String c){
        this.corPelo = c;
    }
}

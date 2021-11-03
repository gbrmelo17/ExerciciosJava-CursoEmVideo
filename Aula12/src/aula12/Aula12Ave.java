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
public class Ave extends Animal {
    private String corPena;
    
    public void fazerNinho(){
        System.out.println("A Ave fez um ninho!");
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Som de ave");
    }
    
    public String getCorPena(){
        return this.corPena;
    }
    
    public void setCorPena(String c){
        this.corPena = c;
    }
}

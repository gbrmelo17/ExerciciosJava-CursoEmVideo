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
public class Mamifero extends Animal{
    private String corPelo;
    
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero");
    }
    
    public String getCorPelo(){
        return this.corPelo;
    }
    
    public void setCorPelo(String p){
        this.corPelo = p;
    }
}

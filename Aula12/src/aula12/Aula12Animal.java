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
 public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;
    
    public abstract void  locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float p){
        this.peso = p;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public int getMembros(){
        return this.membros;
    }
    
    public void setMembros(int m){
        this.membros = m;
    }
        
    
}

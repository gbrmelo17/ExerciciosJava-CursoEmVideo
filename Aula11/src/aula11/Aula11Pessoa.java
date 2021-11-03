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
abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }

    
    
    
}

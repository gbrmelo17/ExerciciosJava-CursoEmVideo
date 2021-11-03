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
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    public void receberAumento(){
        
    }
    
    public String getEspecialidade(){
        return this.especialidade;
    }
    
    public void setEspecialidade(String e){
        this.especialidade = e;
    }
    
    public float getSalario(){
        return this.salario;
    }
    
    public void setSalario(float s){
        this.salario = s;
    }
}

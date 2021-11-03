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
public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.getTrabalhando());
    }
    
    public String getSetor(){
        return this.setor;
    }
    
    public void setSetor(String s){
        this.setor = s;
    }
    
    public boolean getTrabalhando(){
        return this.trabalhando;
    }
    
    public void setTrabalhando(boolean t){
        this.trabalhando = t;
    }
    
}

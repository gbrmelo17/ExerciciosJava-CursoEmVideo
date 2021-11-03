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
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void cancelarMatr(){
        this.setMatricula(0);
        System.out.println("Matricula cancelada!");
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int m){
        this.matricula = m;
    }
    
    public String getCurso(){
        return this.curso;
    }
    
    public void setCurso(String c){
        this.curso = c;
    }
}

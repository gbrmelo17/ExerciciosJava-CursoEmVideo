/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofinalcursopoo;

/**
 *
 * @author Gabriel
 */
public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        setLogin(login);
        setTotAssistido(0);
    }
    
    public void viuMaisUm(){
        setTotAssistido(getTotAssistido()+1);
    }
    
    public String getLogin(){
        return this.login;
    }
    
    public void setLogin(String l){
        this.login = l;
    }
    
    public int getTotAssistido(){
        return this.totAssistido;
    }
    
    public void setTotAssistido(int t){
        this.totAssistido = t;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + 
                login + ", totAssistido=" + 
                totAssistido + '}';
    }
    
    
}

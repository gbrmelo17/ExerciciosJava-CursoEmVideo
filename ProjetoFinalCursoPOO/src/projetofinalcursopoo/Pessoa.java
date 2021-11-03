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
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
        setExperiencia(0);
    }
    
    
    
    protected void ganharExp(){
        setExperiencia(getExperiencia()+1);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s) {
        this.sexo = s;
    }

    public float getExperiencia() {
        return this.experiencia;
    }

    public void setExperiencia(float e) {
        this.experiencia = e;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + 
                nome + ", idade=" + 
                idade + ", sexo=" + 
                sexo + ", experiencia=" + 
                experiencia + '}';
    }
    
    
    
}

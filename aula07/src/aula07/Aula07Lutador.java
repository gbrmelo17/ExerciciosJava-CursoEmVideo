/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;

/**
 *
 * @author Gabriel
 */
public class Lutador {
    //ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    //CONSTRUTOR
    public Lutador(String n, String nc, int i, float a, float p, int v, int d, int e){
        this.setNome(n);
        this.setNacionalidade(nc);
        this.setIdade(i);
        this.setAltura(a);
        this.setPeso(p);
        this.setVitorias(v);
        this.setDerrotas(d);
        this.setEmpates(e);
    }
    
    
    //METODOS 
    public void apresentar(){
        System.out.println("-----------------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: "+ this.getNacionalidade());
        System.out.println(+ this.getIdade()+ " anos");
        System.out.println(this.getAltura() + " de altura");
        System.out.println("Pesando "+ this.getPeso()+ " Kg");
        System.out.println("Ganhou: "+ this.getVitorias());
        System.out.println("Perdeu: "+ this.getDerrotas());
        System.out.println("Empatou: "+ this.getEmpates());
        
    }
    
    public void status(){
        System.out.print(this.getNome());
        System.out.println(" é um peso "+ this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    
    //METODOS ESPECIAIS
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNacionalidade(){
        return this.nacionalidade;
    }
    
    public void setNacionalidade (String n){
        this.nacionalidade = n;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int i){
        this.idade = i; 
    }
    
    public float getAltura(){
        return this.altura;
    }
    
    public void setAltura(float a){
        this.altura = a;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public void setPeso(float p){
        this.peso = p;
        setCategoria();
    }
    
    public String getCategoria(){
        return this.categoria;
    }
    
    private void setCategoria(){
       if((this.getPeso() >= 50 ) && (this.getPeso() < 70)){
           this.categoria = "LEVE";
       } else if((this.getPeso() >= 70) && (this.getPeso() < 90)){
           this.categoria = "MEDIO";
       } else if ((this.getPeso() >= 90) && (this.getPeso() < 120)){
           this.categoria = "PESADO";
       }
    }
    
    public int getVitorias(){
        return this.vitorias;
    }
    
    public void setVitorias(int v){
        this.vitorias = v;
    }
    
    public int getDerrotas(){
        return this.derrotas;
    }
    
    public void setDerrotas(int d){
        this.derrotas = d;
    }
    
    public int getEmpates (){
        return this.empates;
    }
    
    public void setEmpates (int e){
        this.empates = e;
    }
}


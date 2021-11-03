/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Gabriel
 */
public class Caneta {
    private String modelo; // private nao permite acesso direto de outras classes
    private float ponta;
    private String cor;
    private boolean tampada;
    
    public Caneta(String m,  String c, float p){ // metodo construtor (sempre que tiver o mesmo nome da classe é o construtor)
       this.setModelo(m);                        // define os atributos PADROES de quando um obejeto for instanciado(criado)
       this.setCor(c);
       this.setPonta(p);
       this.tampar(); 
       
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Tampada: "+ this.tampada);
    
    
}
    
}

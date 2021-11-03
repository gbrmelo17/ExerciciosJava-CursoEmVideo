/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06;

/**
 *
 * @author Gabriel
 */
public class ControleRemoto implements Controlador{
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //CONTROLADOR
    public ControleRemoto(){
    setVolume(50);
    setLigado(true);
    setTocando(false);
}
    //METODOS ABSTRATOS
    @Override
    public void ligar(){
        this.setLigado(true);
    }
    
    @Override
    public void desligar(){
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu(){
        if(this.getLigado() == true){
            System.out.println("----TELA DE MENU----");
            System.out.println("Controle Ligado: "+ this.getLigado());
            System.out.println("Som Ligado: "+ this.getTocando());
            System.out.print("Volume: " + this.getVolume());
            for(int i = 0; i <= this.getVolume(); i+=10){
                System.out.print("|");
            }
            System.out.println(" ");
            System.out.println("--------------------");
        }
    }
    
    @Override
    public void fecharMenu(){
        System.out.println("Menu fechado!");
    }
    @Override
    public void maisVolume(){
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
            System.out.println("Volume Aumentado para: "+ this.getVolume());
        } else {
            System.out.println("Impossivel aumentar o volume!");
        }
        
    }
    
    @Override
    public void menosVolume(){
        if(this.getLigado() == true){
            this.setVolume(this.getVolume()- 5);
            System.out.println("Volume Diminuido para: "+ this.getVolume());
        } else {
            System.out.println("Impossivel diminuir o volume!");
        }
    }
    
    @Override
    public void ligarMudo(){
        if((this.getLigado() == true) && (this.getVolume() > 0)){
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo(){
        if((this.getLigado() == true)&& (this.getVolume() == 0)){
            this.setVolume(50);
        }
    }
    
    @Override
    public void play(){
        if((this.getLigado() == true) && (this.getTocando() == false)){
            this.setTocando(true);
        } else {
            System.out.println("Impossivel de reproduzir!");
        }
        
    }
    
    @Override
    public void pause(){
        if((this.getLigado() == true) && (this.getTocando() == true)){
            this.setTocando(false);
        } else {
            System.out.println("Impossivel de pausar!");
        }
    }
    
    // METODOS ESPECIAIS GETTER E SETTER
    private int getVolume(){
        return this.volume;
    }
    
    private void setVolume(int v){
        this.volume = v;
    }
    
    private boolean getLigado(){
        return this.ligado;
    }
    
    private void setLigado(boolean l){
        this.ligado = l;
    }
    
    private boolean getTocando(){
        return this.tocando;
    }
    
    private void setTocando(boolean t){
        this.tocando = t;
    }
}

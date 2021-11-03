/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07;


import java.util.Random;

/**
 *
 * @author Gabriel
 */
public class Luta {
    //ATRIBUTOS
   private Lutador desafiado; //  instancia da classe lutador(agregaçao)
   private Lutador desafiante; // uma luta tem um lutador 
   private int rounds;
   private boolean aprovada;
   
   //METODOS 
   public void marcarLuta(Lutador l1, Lutador l2){
       if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
           System.out.println("Luta Marcada com sucesso!");
           this.setAprovada(true);
           this.setDesafiado(l1);
           this.setDesafiante(l2);
       } else {
           System.out.println("Impossivel de marcar luta");
           this.setAprovada(false);
           this.setDesafiado(null);
           this.setDesafiante(null);
       }
       
   }
    
   public void lutar(){
       if(this.getAprovada()){
           System.out.println("### DESAFIADO ###");
           this.desafiado.apresentar();
           System.out.println(" ");
           System.out.println("### DESAFIANTE ###");
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);
           switch (vencedor){
               case 0:
                   System.out.println("-----------------------");
                   System.out.println("Empatou!");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
                   
               case 1:
                   System.out.println("-----------------------");
                   System.out.println(this.desafiado.getNome() + " Ganhou a luta!");
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
                
               case 2:
                   System.out.println("-----------------------");
                   System.out.println(this.desafiante.getNome() + " Ganhou a Luta!");
                   this.desafiante.ganharLuta();
                   this.desafiado.perderLuta();
                   break;
           }
           
           
       } else {
           System.out.println("Luta nao pode acontecer!");
       }
       
   }
   
   //METODOS ESPECIAIS
   public Lutador getDesafiado(){
       return this.desafiado;
   }
   
   public void setDesafiado(Lutador d){
       this.desafiado = d;
   }
   
   public Lutador getDesafiante(){
       return this.desafiante;
   }
   
   public void setDesafiante(Lutador d){
       this.desafiante = d;
   }
   
   public int getRounds(){
       return this.rounds;
   }
   
   public void setRounds(int r){
       this.rounds = r;
   }
   
   public boolean getAprovada(){
       return this.aprovada;
   }
   
   public void setAprovada(boolean a){
       this.aprovada = a;
   }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05;

/**
 *
 * @author Gabriel
 */
public class ContaBancaria {
   //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
  //CONSTRUTOR  
public ContaBancaria(){
    this.setStatus(false);
    this.setSaldo(0);
}

//METODOS DA CLASSE
public void infoConta(){
    System.out.println("----------------------------------");
    System.out.println("Numero da conta: "+ this.getnumConta());
    System.out.println("Tipo: "+ this.getTipo());
    System.out.println("Dono: "+ this.getDono());
    System.out.println("Saldo: "+ this.getSaldo());
    System.out.println("A conta esta aberta? "+ this.getStatus());
}    

public void abrirConta(String t){
    this.setTipo(t);
    this.setStatus(true);
    if(this.getTipo() == "CC"){
        this.setSaldo(50);
        System.out.println("Conta Corrente aberta c sucesso!");
    } else if (this.getTipo() == "CP"){
        this.setSaldo(150);
        System.out.println("Conta Poupança aberta c sucesso!");
    }
}

public void fecharConta(){
    if(this.getSaldo() > 0){
        System.out.println("Saldo em conta, impossivel fechar conta!");
    } else if (this.getSaldo() < 0){
        System.out.println("Saldo negativo, impossivel fechar conta! ");
    } else {
        this.setStatus(false);
        System.out.println("Conta Fechada com Sucesso!");
    }
}

public void depositar(float v){
if(this.getStatus() == true){
   this.setSaldo(getSaldo() + v);
    System.out.println("Valor Depositado na coonta de "+ this.getDono() + " c sucesso!");
} else {
    System.out.println("Conta inexistente");
}    
}

public void sacar(float v){
   if(this.getStatus() == true){
       if(this.getSaldo() >=  v){
           this.setSaldo(getSaldo() - v);
           System.out.println("Saque realizado na conta de "+ this.getDono() +" com sucesso!");
       } else {
           System.out.println("Saldo insuficiente para saque!");
       }
   } else {
       System.out.println("Conta Inexistente");
   }
}

public void pagarMensalidade(){
    int v =0;
    if(this.getStatus() == true){
        if(this.getTipo() == "CC"){
            v = 12;
             if(this.getSaldo() > v){
             this.setSaldo(getSaldo() - v);
             System.out.println("Mensalidade paga com sucesso!");
         } else {
             System.out.println("Saldo insuficiente p realizar pagamento da mensalidade");
         }
         
         } else if(this.getTipo() == "CP"){
        v = 20;
        if(this.getSaldo() > v){
             this.setSaldo(getSaldo() - v);
             System.out.println("Mensalidade paga com sucesso!");
         } else {
             System.out.println("Saldo insuficiente p realizar pagamento da mensalidade");
         }
    }
    } else{
        System.out.println("Conta inexistente!");
    }
}

//METODOS ESPECIAIS GETTER E SETTER
public int getnumConta(){
    return this.numConta;
}

public void setnumConta(int n){
    this.numConta = n;
}

public String getTipo(){
    return this.tipo;
}

public void setTipo(String t){
    this.tipo = t;
}

public String getDono(){
    return this.dono;
}

public void setDono(String d){
    this.dono = d;
}

public float getSaldo(){
    return this.saldo;
}

public void setSaldo(float s){
    this.saldo = s;
}

public boolean getStatus(){
    return this.status;
}

public void setStatus(boolean s){
    this.status = s;
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09;

/**
 *
 * @author Gabriel
 */
public class Livro implements Publicaçao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    public String detalhes(){
        return "Livro: " + "titulo " + this.getTitulo() + "\n" + 
                "Autor: " + this.getAutor() + "\n" +
                "Total de Paginas: " + this.getTotPaginas() + "\n" +
                "Pagina Atual: " + this.getPagAtual() + "\n" +
                "Aberto? " + this.getAberto() + "\n" +
                "Leitor: " + this.leitor.getNome() + "\n" +
                "Idade: " + this.leitor.getIdade() + "\n" +
                "Sexo: " + this.leitor.getSexo();
    }

    public Livro(String t, String a, int totP, Pessoa l) {
        this.setTitulo(t);
        this.setAutor(a);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setTotPaginas(totP);
        this.setLeitor(l);
    }
    
    
    
    @Override
    public void abrir(){
        this.setAberto(true);
    }
    
    @Override
    public void fechar(){
        this.setAberto(false);
    }
    
    @Override
    public void folhear(int p){
    if(this.getAberto() && (this.getTotPaginas() > p )){
        this.setPagAtual(p);
        }    
    }
    
    @Override
    public void avançarPag(){
        if(this.getAberto()){
        this.setPagAtual(this.getPagAtual() + 1);
        }
    }
    
    @Override
    public void voltarPag(){
        if(this.getAberto()){
            this.setPagAtual(this.getPagAtual() - 1);
        }
    }
    
    
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    
    public int getTotPaginas(){
        return this.totPaginas;
    }
    
    public void setTotPaginas(int t){
        this.totPaginas = t;
    }
    
    public int getPagAtual(){
        return this.pagAtual;
    }
    
    public void setPagAtual(int p){
        this.pagAtual = p;
    }
    
    public boolean getAberto(){
        return this.aberto;
    }
    
    public void setAberto(boolean a){
        this.aberto = a;
    }
    
    public Pessoa getLeitor(){
        return this.leitor;
    }
    
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
}


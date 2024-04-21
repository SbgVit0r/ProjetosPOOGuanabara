
package com.mycompany.pessoa;

public class Livro implements Publicacao {
    private String livro, autor;
    private Pessoa leitor;
    private int totPaginas, pagAtual;
    private boolean aberto;

    public String detalhes() {
        return "Livro:" + "\n livro = " + livro + "\n autor = " + autor + "\n leitor = " + leitor.getNome() + "\n totPaginas = " + totPaginas + "\n pagAtual = " + pagAtual + "\n aberto = " + aberto + "\n idade = " + leitor.getIdade() + "\n sexo = " + leitor.getSexo();
    }
    
    
    
    public Livro(String l, String a, Pessoa le, int tp){
        this.livro = l;
        this.autor = a;
        this.leitor = le;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    
    
    // Métodos Especiais
    public String getLivro(){
        return livro;
    }
    
    public void setLivro(String n){
        this.livro = n;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAutor(String a){
        this.autor = a;
    }
    
    public Pessoa getLeitor(){
        return leitor;
    }
    
    public void setLeitor(Pessoa l){
        this.leitor = l;
    }
    
    public int getTotPaginas(){
        return totPaginas;
    }
    
    public void setTotPaginas(int tp){
        this.totPaginas = tp;
    }
    
    public int getPagAtual(){
        return pagAtual;
    }
    
    public void setPagAtual(int pg){
        this.pagAtual = pg;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean a) {
        this.aberto = a;
    }
    
    // Métodos Abstratos
    
    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void avancarPag() {
        if (this.aberto == true){
        this.pagAtual++;   
        }else{
            System.out.println("Abra o livro primeiro!");
        }
        
    }

    @Override
    public void voltarPag() {
        if(this.aberto == true){
            this.pagAtual--;
        }else {
            System.out.println("Abra o livro primeiro!");
        }
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas && this.aberto == true){
            System.out.println("Você está folheando acima do limite de Páginas!");
        }else if (p <= this.totPaginas && this.aberto == true){
         this.pagAtual = p;
        }else if (this.aberto == false){
            System.out.println("Abra o livro primeiro!");
        }
    }
    
    
    
}

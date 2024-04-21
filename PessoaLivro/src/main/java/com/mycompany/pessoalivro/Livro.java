package com.mycompany.pessoalivro;
public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    public Livro(String t, String a, int tp, Pessoa l){
        this.titulo = t;
        this.autor = a;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = l;
        
    }
    
    
    // Métodos Especiais
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitutlo(String t){
        this.titulo = t;
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
    
    public boolean getAberto(){
        return aberto;
    }
    
    public void setAberto(boolean a){
        this.aberto = a;
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
     
     public void setPagAtual(int pa){
         this.pagAtual = pa;
     }
     
     // Métodos Personalizados
    
     public void detalhes(){
         System.out.println("Título: "+this.getTitulo());    
         System.out.println("Autor: "+this.getAutor());
         System.out.println("Total de páginas: "+this.getTotPaginas());
         System.out.println("Página Atual: "+this.getPagAtual());
         System.out.println("Este livro está aberto? : "+this.getAberto());
         System.out.println("Leitor atual: "+this.leitor.getNome());
     }
    
    // Métodos Abstratos
     
    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void folhear(int p) {
        if (p <= this.getTotPaginas() && this.aberto == true){
        this.pagAtual = p;
        }else if (p > this.getTotPaginas() && this.aberto == true){
            this.pagAtual = 0; 
        }else if (this.aberto == false){
        System.out.println("Abra o livro primeiro!");
        }
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
        if (this.aberto == true){
        this.pagAtual--;
        }else{
            System.out.println("Abra o livro primeiro!");
        }
    }
     
     
}

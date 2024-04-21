package com.mycompany.pessoa;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    
    public Pessoa(String n, String s, int i){ // Método Construtor
        this.nome = n;
        this.sexo = s;
        this.idade = i;
    }
    
    // Métodos Especiais
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    } 
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    // Métodos Personalizados
   
    public void fazerAniver(){
        this.idade++;
    }
    
}

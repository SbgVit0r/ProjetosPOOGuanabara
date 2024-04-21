
package com.mycompany.heranca;

public abstract class Pessoa {
    private String nome, sexo;
    private int idade;
    
       
    //Métodos Especiais
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String s){
        this.sexo = s;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int i){
        this.idade = i;
    }
    
    public final void fazerAniv(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa: " + "\n nome = " + nome + "\n sexo = " + sexo + "\n idade = " + idade;
    }
    
    
    
}

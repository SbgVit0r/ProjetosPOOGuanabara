
package com.mycompany.pessoalivro;

public class Pessoa {
  private String nome, sexo;
  private int idade;

  public Pessoa(String n, String s, int i){ // Método Construtor
      this.nome = n;
      this.sexo = s;
      this.idade = i;
  }
  
    // Métodos Especiais 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  
    // Métodos Personalizados
    
    public void fazerAniver(){
        this.idade++;
    }
    
   
}

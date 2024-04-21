package com.mycompany.video;
public abstract class Pessoa {
    protected String nome, sexo;
    protected int idade;
    protected int experiencia;
    
    public Pessoa(String n, String s, int i){
        this.nome = n;
        this.sexo = s;
        this.idade = i;
        this.experiencia = 0;
    }
            
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    protected abstract void ganharExp();

    @Override
    public String toString() {
        return "\n nome = " + nome + "\n sexo = " + sexo + "\n idade = " + idade + "\n experiencia = " + experiencia;
    }
    
    
}

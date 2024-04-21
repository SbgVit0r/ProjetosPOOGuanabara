package com.mycompany.pessoa;
public class PessoaMain {
    public static void main(String[] args) {
        Pessoa p [] = new Pessoa [3];
        Livro l [] = new Livro [3];
        
        p[0] = new Pessoa("Felipe", "Masculino", 35);
        p[1] = new Pessoa("Marcia", "Feminino", 27);
        p[2] = new Pessoa("Fabio", "Masculino", 23);
        
        l[0] = new Livro("Terra média", "Tolkien", p[0], 320);
        l[1] = new Livro("Percy Jackson", "Rick Riordan", p[1], 240);
        l[2] = new Livro("Bibli Sagrada", "Sei lá", p[2], 1000); 
        

        
        
        l[0].folhear(321);
        System.out.println(l[0].detalhes());
    }
    
}

package com.mycompany.pessoalivro;
public class Aula09 {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa ("João", "Masculino", 35);
       
        l[0] = new Livro ("Harry Potter", "JK", 321, p[0]);
        
        l[0].fechar();
        l[0].folhear(322);
        l[0].detalhes();
     }
    
}

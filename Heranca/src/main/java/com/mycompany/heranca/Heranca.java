
package com.mycompany.heranca;

import java.util.HashSet;

public class Heranca {
    public static void main(String[] args) {
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();
      
      p2.setNome("Fabiano");
      p3.setNome("Juliana");
      p4.setNome("João");
      
      p2.setIdade(28);
      p3.setIdade(23);
      p4.setIdade(21);
      
      p2.setSexo("Masculino");
      p3.setSexo("Feminino");
      p4.setSexo("Masculino");
       
      p2.setCurso("Mecatrônica");
      
     
      System.out.println(p2.toString());
      System.out.println(p3.toString());
      System.out.println(p4.toString());
    }
    
}

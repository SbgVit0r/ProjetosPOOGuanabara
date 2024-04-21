package com.mycompany.mediapoo;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, turma;
        double n1, n2;
        System.out.println("Insira os dados do Aluno:");
        nome = sc.nextLine();
        turma = sc.nextLine();
        System.out.println("Digite suas notas:");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        
    }   
        public static void Status(String nome, String turma, double n1, double n2){
        nome = nome;
        turma = turma;
        double s;
        double m;
        s = n1 + n2;
        m = s/2;
        System.out.println("Aluno : "+nome);
        System.out.println("Turma : "+turma);
        System.out.println("A média total do aluno é: "+m);
        if (m >= 6.0){
            System.out.println("Aluno aprovado");
        }
        else {
            System.out.println("Aluno reprovado!");
        }
        }

        
       
} 
    


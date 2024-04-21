package com.mycompany.video;
public class ProjetoFinal {
    public static void main(String[] args) {
        
        Video v[] = new Video[3];
        v[0] = new Video("Curso de JAVA para inciantes");
        v[1] = new Video("Joguei Césio 137 na piscina e olha no que deu");
        
        Gafanhoto g[] = new Gafanhoto [3];
        g[0] = new Gafanhoto ("Jonas", "Masculino", 24, "jon");
        g[1] = new Gafanhoto ("Marcia", "Feminino", 26, "ma38");
        
        Visualizacao vi[] = new Visualizacao[3];
        vi[0] = new Visualizacao(g[0], v[0]);
        vi[0].avaliar(60.0f);
        System.out.println(vi[0].toString());
        System.out.println("======================");
        vi[1] = new Visualizacao(g[1], v[1]);
        vi[1].avaliar(7);
        System.out.println(vi[1].toString());
        /*System.out.println(v[0].toString());
        System.out.println("====================================");
        System.out.println(g[0].toString());*/
    }
    
}

package com.mycompany.heranca;
public class Aluno extends Pessoa {
    private boolean matr;
    private String curso;
    
    public boolean getMatr(){
        return matr;
    }
    
    public void setMatr(boolean m){
        this.matr = m;
    }
    
    public String getCurso(){
        return curso;
    }
    
    public void setCurso(String c){
        this.curso = c;
    }
    
    public void cancelarMatr(){
        this.matr = false;
    }
    
    public void pagarMensal(){
        
    }
}

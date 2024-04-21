
package com.mycompany.heranca;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;
    
   
    
    public String getEspecial(){
        return especialidade;
    }
    
    public void setEspecial(String e){
        this.especialidade = e;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float s){
        this.salario = s;
    }
    
    public void receberAum(){
        this.salario = this.getSalario() + (this.getSalario() * 0.035f);
    }
}

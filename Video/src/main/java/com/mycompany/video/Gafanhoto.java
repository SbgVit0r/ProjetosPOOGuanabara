package com.mycompany.video;
public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistido;

    public Gafanhoto(String n, String s, int i, String l) {
        super(n, s, i);
        this.login = l;
        this.totAssistido = 0;
    }
    
    public void viuMaisUm(){
        this.totAssistido++;
    }
    
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    protected void ganharExp() {
        
    }

    @Override
    public String toString() {
        return "Gafanhoto: " + super.toString() + "\n login = " + this.getLogin() + "\n totAssistido=" + this.getTotAssistido();
    }

    
    
}

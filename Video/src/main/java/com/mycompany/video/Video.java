package com.mycompany.video;
public class Video implements AcoesVideo {
    private String titulo;
    private int views, curtidas, avaliacao;
    private boolean reproduzindo;
    
    public Video(String t){
        this.titulo = t;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }
    
    // Getters e Setters
    
    
    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.avaliacao + avaliacao)/this.views;
        
        this.avaliacao = avaliacao;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public float getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    // Métodos Abstratos
    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }
   
    @Override
    public void like() {
        this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video:" + "\n titulo = " + this.getTitulo() + "\n views = " + this.getViews() + "\n curtidas = " + this.getCurtidas() + "\n reproduzindo = " + this.getReproduzindo() + "\n avaliacao = " + this.getAvaliacao();
    }
    
    
}

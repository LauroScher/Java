/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exschertoba;

/**
 *
 * @author lauro
 */
public class Vídeo implements AcoesVideo{
       private String título; 
       private int avaliacao;
       private int views;
       private int curtidas;
       private boolean reproduzir;

       public Vídeo(String titulo){
       this.título = titulo; 
       this.avaliacao = 1; 
       this.curtidas = 0;
       this.views = 0; 
       this.reproduzir = false;
       
       }
    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzir() {
        return reproduzir;
    }

    public void setReproduzir(boolean reproduzir) {
        this.reproduzir = reproduzir;
    }
       
       
    @Override
    public void play() {
        
    }

    @Override
    public void pause() {
        
    }

    @Override
    public void like() {
        
    }
    
}

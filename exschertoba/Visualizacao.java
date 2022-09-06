/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exschertoba;

/**
 *
 * @author lauro
 */
public class Visualizacao {
    private Scher espectador;
    private Vídeo filme;

    public Visualizacao(Scher espectador, Vídeo filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.settotAssistido(this.espectador.gettotAssistido() + 1);
    }

    
    
    public Scher getEspectador() {
        return espectador;
    }

    public void setEspectador(Scher espectador) {
        this.espectador = espectador;
    }

    public Vídeo getFilme() {
        return filme;
    }

    public void setFilme(Vídeo filme) {
        this.filme = filme;
    }
    
}

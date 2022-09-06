/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excontrole;

/**
 *
 * @author lauro
 */
public class ControleRemoto implements Controlador {
    private int volume; 
    private boolean ligado;


public ControleRemoto(){
 this.volume = 10; 
 this.ligado = false;
}
 
public int getVolume(){
return this.volume;
}

public boolean getLigado(){
return this.ligado;
}

public void setVolume(int v){
this.volume = v;
}

public void setLigado(boolean l){
this.ligado = l;
}

    @Override
    public void ligar() {
   this.setLigado(true);
    }

    @Override
    public void desligar() {
    this.setLigado(false);
    }

    @Override
    public void volumemais() {
    if (this.getLigado() && this.getVolume() > 0) {
    this.setVolume(this.getVolume() + 1);
    }
    }
    @Override
    public void volumemenos() {
    if (this.getLigado()){
    this.setVolume(this.getVolume() - 1);
    }
    }
 public void menu(){
     if (this.getLigado() == true){
     System.out.println("Ligado");
     }else{
         System.out.println("desligado");
     }
     System.out.println("Volume " + this.getVolume());
     }

}
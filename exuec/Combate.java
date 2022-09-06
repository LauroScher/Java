/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exuec;

import java.util.Random;

/**
 *
 * @author lauro
 */
public class Combate {
    private Lutador desafiado;
    private Lutador desafiante; 
    private int round;
    private boolean aprovado; 
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
          this.aprovado = true; 
          this.desafiado = l1;
          this.desafiante = l2; 
        }else{
        this.aprovado = false;
        this.desafiado = null;
        this.desafiante = null;
        }
    }

   public void lutar(){
   if (this.aprovado){
   this.desafiado.apresentar();
   System.out.println("versos");
   this.desafiante.apresentar();
   
   Random aleatorio = new Random();
   int vencedor = aleatorio.nextInt(3);
   
   switch(vencedor){
       case 0: 
           System.out.println("Empate");
           this.desafiado.empatarLuta();
           this.desafiante.empatarLuta();
           break;
       case 1: 
           System.out.println("Vitória de " +this.desafiado);
           this.desafiado.ganharLuta();
           this.desafiante.perderLuta();
           break;
       case 2: 
           System.out.println("Vitória de " +this.desafiante);
           this.desafiante.ganharLuta();
           this.desafiado.perderLuta();
           break;
   }
   }else{
   System.out.println("Não acontecerá uma luta");
   }
   }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
   
   
}



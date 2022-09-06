/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q6;

/**
 *
 * @author lauro
 */
public class Media {
   private int nota;
    
  public int getNota(){
   return this.nota;
   }
  public void setNota(int n){
   this.nota = n;
  }
    
  public void aluno(int x){
  if (x >= 100 || x <= 0){
      System.out.println("ERRO");
  }else{
   setNota(this.getNota() + x);
  }
}

  public void resultado(){
  System.out.println("Sua média é " + this.getNota());
  }
}
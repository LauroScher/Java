/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

/**
 *
 * @author lauro
 */
public class Car {
    public String cor; 
    public String modelo;
    public int km;
    public void km(){
     if (this.km > 0){
         System.out.println("O carro não é 0 KM ");    
    } else {
         System.out.println("O carro é 0 KM");
     }    
    }
   public void status() {
        System.out.println("A cor do carro é " + this.cor);
        System.out.println("O modelo do carro é um " + this.modelo);
    }
}

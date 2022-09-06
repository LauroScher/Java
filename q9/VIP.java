/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q9;

/**
 *
 * @author lauro
 */
public class VIP extends Ingresso {
        
    
    
    @Override
        public void imprimeValor(){
         this.setValor(this.getValor() + 100);
        System.out.println("Ingresso VIP impresso no valor de " + this.getValor());
    };
}

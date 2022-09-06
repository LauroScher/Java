/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q9;

/**
 *
 * @author lauro
 */
public class CamorteSuperior extends VIP{
    
    @Override
    public void imprimeValor(){
       this.setValor(this.getValor() + 200);
       System.out.println("Ingresso VIP(Camarote Superior) impresso no valor de " + this.getValor());
    };
    
}

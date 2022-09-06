/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q10;

/**
 *
 * @author lauro
 */
public class Novo extends Imovel {
    @Override
    public void imprimirPreço(){
    this.setPreço(this.getPreço() + 10000);
        System.out.println("Preço: " + this.getPreço());
    };
}

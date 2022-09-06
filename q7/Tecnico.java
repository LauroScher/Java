/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q7;

/**
 *
 * @author lauro
 */
public class Tecnico extends Assistente {
    public void bonuSalario(float b){
        this.setSalario(b + this.getSalario());
    };
}

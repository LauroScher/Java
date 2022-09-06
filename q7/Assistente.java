/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q7;

/**
 *
 * @author lauro
 */
public class Assistente extends Funcionario{
    
        @Override
        public void exibeDados(){
        System.out.println("Assistente: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Salario: " + this.getSalario());
    };
}

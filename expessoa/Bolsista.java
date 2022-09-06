/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expessoa;

/**
 *
 * @author lauro
 */
public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando Bolsa do aluno " +this.nome);
    }
    
    
    @Override
    public void pagarMensal(){
        System.out.println("O bolsista " + this.nome + " tem pagamento facilitado");
    }
}

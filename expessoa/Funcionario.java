/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expessoa;

/**
 *
 * @author lauro
 */
public class Funcionario extends Pessoa {
    private String seto; 
    private boolean Trabalhando;
    
    public void mudarTrabalho(){
        this.Trabalhando = ! this.Trabalhando;
    }

    public String getSeto() {
        return seto;
    }

    public void setSeto(String seto) {
        this.seto = seto;
    }

    public boolean isTrabalhando() {
        return Trabalhando;
    }

    public void setTrabalhando(boolean Trabalhando) {
        this.Trabalhando = Trabalhando;
    }
}

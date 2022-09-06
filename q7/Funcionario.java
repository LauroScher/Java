/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q7;

/**
 *
 * @author lauro
 */
public class Funcionario {
    private String nome; 
    private int matricula;
    private float salario;
    private String turno; 

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
    public void exibeDados(){
        System.out.println("Funcionario: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Salario: " + this.getSalario());
    };
 
   
}

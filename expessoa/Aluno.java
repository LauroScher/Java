/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package expessoa;
public class Aluno extends Pessoa {
    private int matr;
    private String curso; 
    public void pagarMensal(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    
    public void cancelarMatr(){
    System.out.println("Matrícula será cancelada");
    }
    
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}

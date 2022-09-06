/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q7;

/**
 *
 * @author lauro
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tecnico t = new Tecnico();
        Administrativo a = new Administrativo();
        t.setNome("Lauro");
        t.setMatricula(923);
        t.setSalario(1000);
        t.bonuSalario(500);
        t.exibeDados();
        
        a.setNome("Luanna");
        a.setMatricula(29384);
        a.setSalario(1000);
        a.exibeDados();
        
    }
    
}

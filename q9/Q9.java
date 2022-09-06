/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q9;

/**
 *
 * @author lauro
 */
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CamorteSuperior c = new CamorteSuperior();
       CamaroteInferior c2 = new CamaroteInferior();
       c2.setLocalizacao("AB");
       c2.imprimirLocalização();
       c.setValor(200);
       c.imprimeValor();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exbanco;

/**
 *
 * @author lauro
 */
public class ExBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta p1 = new Conta();
        p1.setDono("Luanna");
        p1.setNumconta(1234578);
        p1.abriConta("CP");
        p1.sacar(150);
        p1.fecharConta();
    }
    
}

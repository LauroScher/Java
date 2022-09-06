/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exuec;

/**
 *
 * @author lauro
 */
public class ExUEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lutador l[] = new Lutador[3];
        l[0] = new Lutador("Lauro", "Brazil", 21, 1.80f, 73.0f, 10, 0, 0);
        
        l[1] = new Lutador("NeferPitou", "Brazil", 1, 0.2f, 0.8f, 0, 0, 0);
        
        l[2] = new Lutador("Luanna", "Brazil", 22, 1.35f, 35.0f, 0, 0, 0);
        
        Combate c = new Combate(); 
        c.marcarLuta(l[0], l[2]);
        c.lutar();
    }
    
}

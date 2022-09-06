/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q9;

/**
 *
 * @author lauro
 */
public class CamaroteInferior extends VIP{
    public String localizacao; 

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public void imprimirLocalização(){
        System.out.println("Sua localização é "+ this.getLocalizacao());
    };

}
  
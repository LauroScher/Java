/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caneta;

/**
 *
 * @author lauro
 */
public class Tipo {
    public String modelo;
    private float ponta;  
    private String cor;
    private boolean tampada;
    
    
    public Tipo(String m , String c, float p){//metodo construtor 
    this.setModelo(m);
    this.setCor(c);
    this.setPonta(p);
    this.tampar();
    
    
    }
    public String getModelo(){
    return this.modelo;
    }

    public void setModelo( String m){
    this.modelo = m; 
    }
   
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
    this.ponta = p;
    }
    
    public void tampar() {
    this.tampada = true;
    }
    
    public boolean getTampada(){
    return this.tampada;
    }
    
    public String getCor(){
    return this.cor;
    }
    
    public void setCor( String c){
    this.cor = c;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta: ");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ponta: " + getPonta());
        System.out.println("Cor: " + getCor());
        System.out.println("Status Nova :" + getTampada());
    }    
}

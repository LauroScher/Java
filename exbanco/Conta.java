/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exbanco;

/**
 *
 * @author lauro
 */
public class Conta {
    public int numConta; 
    protected String tipo; 
    private String dono; 
    private float saldo; 
    private boolean status;
    
    public void situação(){
      if (this.getStatus() == true){
          System.out.println("Olá! " + this.getDono());
          System.out.println("Conta de número " +this.getNumconta());
          System.out.println("Saldo disponível: " + this.getSaldo());
      }else{
          System.out.println("Conta não existe");
      }
    } 
   
    public Conta(){
    this.setSaldo(0); 
    this.setStatus(false); 
    }
    
    public void setNumconta(int n){
    this.numConta = n; 
    }
    
    public int getNumconta(){
    return this.numConta;
    }
    
    public void setTipo(String t){
    this.tipo = t;
    }
    
    public String getTipo(){
    return this.tipo;
    }
    
    public void setDono(String d){
    this.dono = d; 
    }
    
    public String getDono(){
    return this.dono;
    }
    
    public void setSaldo(float sal){
    this.saldo = sal;
    }
    
    public float getSaldo(){
    return this.saldo;
    }

    public void setStatus(boolean s){
    this.status = s; 
    }

    public boolean getStatus(){
    return this.status;
    }
    
    public void abriConta(String t){
    setTipo(t);
    setStatus(true);
    if(t == "CC"){
       this.setSaldo(50);
    }else if (t == "CP"){
        this.setSaldo(150);  
    }
   }
    
    public void fecharConta(){
    if (this.getSaldo() > 0){
        System.out.println("Conta com dinheiro");
    }else if (this.getSaldo() < 0){
        System.out.println("Conta em debito");
    }else{
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso");
    }
    }
    
    public void depositar(float v){
    if (this.status == true){
    this.setSaldo(this.getSaldo() + v);
        System.out.println("Depósito de " + v +  " realizado na conta de " + this.getDono());
    }else{
        System.out.println("Impossível depositar");
    }
    }
    
    public void sacar(float v){
    if (this.status == true){
      if (this.getSaldo() >= v ){
      this.setSaldo(this.getSaldo() - v);
          System.out.println(this.getDono() + " o seu saque de "+ v +" foi realizado com sucesso");
      }else{
          System.out.println("Saldo Insuficiente");
      }
    }else{
        System.out.println("Impossível sacar");
    }
    }
    
    public void pagarMesal(){
    float v = 0; 
    if (this.getTipo()== "CC"){
      v = 12;
    }else if(this.getTipo() == "CP"){
      v = 20;
    }
    if(this.getStatus() == true){
      if(this.getSaldo() > v){
      this.setSaldo(this.getSaldo() - v);
      }else{
          System.out.println("Saldo insuficiente");
      }
    }else{
        System.out.println("Impossível pagar");
    }
    }
            
}


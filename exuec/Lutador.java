/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exuec;

/**
 *
 * @author lauro
 */
public class Lutador {
    private String nome; 
    private String nacionalidade; 
    private int idade; 
    private float altura; 
    private float peso; 
    private String categoria; 
    private int vitoria;
    private int derrota; 
    private int empates; 
    
    public Lutador(String n, String nac, int id, float a, float p, int v, int d, int e){
    this.nome = n; 
    this.nacionalidade = nac; 
    this.idade = id;
    this.altura = a;
    this.setPeso(p);
    this.vitoria = v; 
    this.derrota = d; 
    this.empates = e; 
    }
    
    public String getNome(){
    return this.nome;
    }
    
    public void setNome(String n){
    this.nome = n; 
    }
    
    public String getNacionalidade(){
    return this.nacionalidade;
    }
    
    public void setNacionalidade(String nac){
    this.nacionalidade = nac;
    }
    
    public int getIdade(){
    return this.idade;
    }
    
    public void setIdade(int id){
    this.idade = id; 
    }
    
    public float getAltura(){
    return this.altura;
    }
    
    public void setAltura(float a){
    this.altura = a; 
    }
    
    public float getPeso(){
    return this.peso;
    }
    
    public void setPeso(float p){
    this.peso = p;
    this.setCategoria();
    }
    
    public String getCategoria(){
    return this.categoria;
    }
    
    private void setCategoria(){ 
    if(this.getPeso() < 52.2){
    this.categoria = "Inválido";
    }else if(this.getPeso() <= 70.3){
    this.categoria = "Leve";
    }else if(this.getPeso() <= 83.9){
    this.categoria = "Médio";
    } else if(this.getPeso() <= 120.2){
    this.categoria = "Pesado";
    }else{
    this.categoria = "Inválido";
    }
    }
    
    public int getVitoria(){
    return this.vitoria;
    }
    
    public void setVitoria(int v){
    this.vitoria = v;
    }
    
    public int getDerrota(){
    return this.derrota;
    }
    
    public void setDerrota(int d){
    this.derrota = d;
    }
    
    public int getEmpate(){
    return this.empates;
    }
    
    public void setEmpate(int e){
    this.empates = e; 
    }
     
    public void apresentar(){
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Peso: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitoria());
        System.out.println("Perdeu: " + this.getDerrota());
        System.out.println("Empatou: " + this.getEmpate());
    }
    
    public void status(){
    System.out.println(this.getNome());
    System.out.println("Categoria: " + this.getCategoria());
    System.out.println(this.getVitoria() + " vitórias");
    System.out.println(this.getDerrota() + " derrotas");
    System.out.println(this.getEmpate() + " empates");
    }
    
    public void ganharLuta(){
      this.setVitoria(this.getVitoria() + 1);
    }
    
    public void perderLuta(){
      this.setDerrota(this.getDerrota() + 1);
    }
    
    public void empatarLuta(){
      this.setEmpate(this.getEmpate() + 1);
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exanimal;

/**
 *
 * @author lauro
 */
public abstract class Animal {
    // Atributos de animal
    protected float peso; 
    protected int idade; 
    protected int membros; 
    
    // Métodos de animal 
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom(); 
}

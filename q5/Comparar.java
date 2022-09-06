/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5;

/**
 *
 * @author lauro
 */
public class Comparar {
    int num1;
    int num2;
    
    void comparacao(){
     if (num1 == num2){
         System.out.println("Os dois números sãos iguais");
     }else{
        if(num1 > num2){
            System.out.println(num1+" > "+num2);
        }else{
           System.out.println(num1+" < "+num2);
        }
     }
    }
}

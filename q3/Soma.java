/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3;

/**
 *
 * @author lauro
 */
public class Soma {
    long num;
    int impar;
    int par; 
    
    void soma(){
     while(num >= 0){
         if(num % 2 != 0){
          impar += num;
     }
      num--;
     }
        System.out.println(impar);
    }
    void multi(){
       long c;
     for(c = 1; c <= num ; c++){
       if(c % 2 == 0){
        c *= par ;
     } 
     }
        System.out.println(par);
    }
}

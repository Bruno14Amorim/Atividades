/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe5;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         int numero;
         Scanner val = new Scanner(System.in);
         System.out.println("informe um numero");
         numero = val.nextInt();
         
         
      if((numero  % 2) == 0)  
         System.out.println("par");
      else 
         System.out.println("impar");
        
        
        
        
    }
    
}

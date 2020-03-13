/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe6;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int x;
        
        Scanner val = new Scanner(System.in);
         System.out.println("informe um numero");
         
         x = val.nextInt();
        
        

        
        System.out.println("Raiz  "+Math.sqrt(x));
        
    }
    
}

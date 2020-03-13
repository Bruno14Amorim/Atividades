/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe8;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        Scanner val = new Scanner(System.in);
        System.out.println("informe o num1");
        num1 = val.nextInt();
        System.out.println("informe o num2");
        num2 = val.nextInt();
        System.out.println("informe o num3");
        num3 = val.nextInt();
        
    
        
        
       if(num1  > num2 && num1 >num3){
           
           System.out.println("O num1 é maior");
       }
       if(num2  > num3 && num2 >num1){
           
           System.out.println("O num2 é maior");
       }  
        if(num3  > num1 && num3 >num2){
           
           System.out.println("O num3 é maior");        
       }
        
        if (num1==num2){
            System.out.println("O num1 é igual ao num2");
        }
        if (num1==num3){
            System.out.println("O num1 é igual ao num3");
        }
       
        if (num3==num2){
            System.out.println("O num3 é igual ao num2");
        }
        
    }
    
    
    
    
    
}

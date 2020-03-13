/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe2;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int anonasc = 0;
       int anoatual = 2020;
       
       Scanner teclado = new Scanner(System.in);
       System.out.println("Informe o ano do seu nascimento");
       anonasc = teclado.nextInt(); 
      
       if(anoatual - anonasc >= 18){
           System.out.println("Fulano, sua entrada foi permitida.");
       }
       else{
        System.out.println("Fulano, sua entrada não foi permitida.");
    }
       
       
       
    }
    
}

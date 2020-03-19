/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe10;

import java.util.Scanner;

/**
 *
 * @author robso
 */
public class Lista1Exe10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner val = new Scanner(System.in);
        int numa;
        int numb;
        System.out.println("informe o numero A");
        numa = val.nextInt();
        
        System.out.println("informe o numero B");
        numb = val.nextInt();
        
        if(numa == numb){
            System.out.println("São iguais");
            System.out.println("Numero A: " + numa);
            System.out.println("Numero B: " + numb);
        }if(numa > numb){
            System.err.println("São diferentes");
            System.out.println("Numero A: " + numa);
            System.out.println("Numero B: " + numb);
        }if(numb > numa){
            System.err.println("São diferentes");
            System.out.println("Numero B: " + numb);
            System.out.println("Numero A: " + numa);
        }
        
    }
    
}

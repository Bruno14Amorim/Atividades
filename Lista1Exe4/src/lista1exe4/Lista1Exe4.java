/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe4;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo = 0, reajuste = 1, resultado, fim;
                
        Scanner scan = new Scanner(System.in);
        
        System.out.println("informe o saldo");
        saldo = scan.nextDouble();
        resultado = (saldo*reajuste)/100;
        fim = resultado + saldo;
        System.out.println(fim);
        
        
        
    }
    
}

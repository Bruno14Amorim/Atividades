/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe7;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =0;
        Scanner val = new Scanner(System.in);
        num = val.nextInt();
        
        if (num == 20){
            System.out.println("igual a 20");
        }
        if (num < 20){
            System.out.println("menor 20");
        }
        if (num > 20){
            System.out.println("maior 20");
        }
    }
    
}

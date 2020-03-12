/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexception;

import java.util.Scanner;


public class Questão2  {
    public static void main(String[] args ) {
        
        boolean tf = true;
         while(tf){
          try {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir");
        System.out.print("Informe o primeiro valor ");
        int x = teclado.nextInt();
        System.out.print("Informe o segundo valor");
        int y = teclado.nextInt();
        double r = (x / y);
        System.out.println("O resultado da divisão é " + r);
            tf = false;
        }catch(Exception a){
            System.out.println("seu valor não é inteiro");
            System.out.println("não sei dividir");
        }
         }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1exe3;

import java.util.Scanner;

/**
 *
 * @author SESI_SENAI
 */
public class Lista1Exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner val = new Scanner(System.in);
        
        double porcentagem = 20,salario = 0,resultado;
        
        
        System.out.println("informe o salario");
        salario = val.nextDouble();
        
        resultado = (salario*porcentagem)/100;
        
        System.out.println(resultado+"%");
        
        
        if (resultado >= porcentagem ){
            System.out.println(resultado+"\n Empréstimo não pode ser concedido.");
        }
        else{
            System.out.println(resultado+"\n Empréstimo  pode ser concedido.");
        }
        
        
        
    }
    
}

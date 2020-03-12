/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeexception;

/**
 *
 * @author SESI_SENAI
 */
public class TesteException {

    public static void main(String[] args) {
        System.out.print("inicio do main");
        try{
            metodo1();
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }
        
        System.out.println("fim do main");
    }
    static void metodo1() throws ArrayIndexOutOfBoundsException{
        System.out.println("inicio do metodo1");
        metodo2();
        System.out.println("fim do metodo1");
    }
    
    static void metodo2()throws ArrayIndexOutOfBoundsException{
        System.out.println("inicio do metodo2");
        
        int[] array = new int[10];
        for (int i = 0; i <=15; i++){
            array[i] = i;
            System.out.println(i);
        }
        System.out.println("fim do metodo2");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;

/**
 *
 * @author SESI_SENAI
 */
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setLimite(100);
        conta.deposito(300);
        try{
            conta.saca(260);
        }catch (ContaExcecao erro){
           
        }
        
    }
}

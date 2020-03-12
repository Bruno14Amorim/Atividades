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
public class Conta {
private int limite;
private int deposito;

    public Conta() {
    }

    public Conta(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
    public void deposito(int dinheiro){
        this.deposito += dinheiro;
    }
    public void saca(int dinheiro) throws ContaExcecao{
        if (dinheiro > this.limite || dinheiro > this.deposito){
            throw new ContaExcecao();
        }
        this.deposito -= dinheiro;
    }
}

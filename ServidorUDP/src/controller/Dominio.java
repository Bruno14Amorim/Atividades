/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

        
        
        
public class Dominio extends DominioController{
    
    public Dominio pesquisaDominio(String host){
        Dominio d = null;
        for(int i = 0;i < ListDominio.size(); i++){
            if (ListDominio.get(i).hostname.equals(host)){
                
                return ListDominio.get(i);
            }
        }
        return d;
    }
    
    public String retornaHost (String host){
        String newValor = "";
        for (int i=0;i <host.length();i++){
            if(host.charAt(i) != '.'){
                newValor += host.charAt(i);
            }else{
                return newValor;
            }
        }
        return newValor;
    }
    
    public String ProcessMensg(String msg){
        String valor = "";
        Dominio d = null;
        String[] arrayHost,array;
        arrayHost  = msg.split("0");
        
        String host = retornaHost(arrayHost[1]);
        d = pesquisaDominio(host);
        if(d != null){
            valor =d.getAddres() + ":"+d.getPort();
        }
        return valor;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Dominio;

/**
 *
 * @author bruno
 */
public class DominioController {
    
    List <Dominio> ListDominio = new ArrayList <Dominio>();

    public DominioController() {
        
        Dominio d1 = new Dominio("hotmail", "127.0.0.1", 5550);
        Dominio d2 = new Dominio("gmail", "127.0.0.1", 5551);
        Dominio d3 = new Dominio("yahoo", "127.0.0.1", 5552);
        Dominio d4 = new Dominio("senai", "127.0.0.1", 5553);
        Dominio d5 = new Dominio("outlook", "127.0.0.1", 5554);
        
        ListDominio.add(d1);
        ListDominio.add(d2);
        ListDominio.add(d3);
        ListDominio.add(d4);
        ListDominio.add(d5);
    }

    public List<Dominio> getListDominio() {
        return ListDominio;
    }
    
    
    
}

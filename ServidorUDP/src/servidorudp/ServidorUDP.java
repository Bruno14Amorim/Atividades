/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorudp;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.*;
import java.net.*;

/**
 *
 * @author rafael.wilmar
 */
public class ServidorUDP {


public static void main(String args[]) throws Exception {
    int numConn = 1;
    byte[] receiveData = new byte[1024];
    byte[] sendData    = new byte[1024];
 		
    //Criando Socket 
    DatagramSocket serverSocket = new DatagramSocket(9876);
 
    while (true) {
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);    
        System.out.println("Esperando por datagrama UDP na porta " + 9876);
	serverSocket.receive(receivePacket);
	System.out.print("Datagrama UDP [" + numConn + "] recebido...");
        // Recebendo pacote
	String sentence = new String(receivePacket.getData());
	System.out.println(sentence);
	// Pegando IP e Porta
	InetAddress IPAddress = receivePacket.getAddress();
        int port = receivePacket.getPort();
        // Colocando a mensagem recebida para maiúsculo
	String capitalizedSentence = sentence.toUpperCase();
        sendData = capitalizedSentence.getBytes();
        // Enviando pacote
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, port);
	System.out.print("Enviando " + capitalizedSentence + "...");
	serverSocket.send(sendPacket);
	System.out.println("OK\n");
    }
}

}

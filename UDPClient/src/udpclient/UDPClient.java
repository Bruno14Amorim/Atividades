/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udpclient;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.io.*;
import java.net.*;

/**
 *
 * @author rafael.wilmar
 */
public class UDPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
        byte[] sendData = new byte[1024];
        byte[] receiveData = new byte[1024];

        // cria um socket UDP Client
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPAddress = InetAddress.getByName("127.0.0.1");
        // Leitura do que enviar 
        System.out.println("Digite o texto a ser enviado ao servidor: ");
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        String sentence = inFromUser.readLine();
        sendData = sentence.getBytes();

        //cria datagrama para enviar request ao servidor
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
        System.out.println("Enviando pacote UDP para " + "127.0.0.1" + ":" + 9876);
        clientSocket.send(sendPacket);
        //prepara buffer para receber
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        clientSocket.receive(receivePacket);
        System.out.println("Pacote UDP recebido...");

        String modifiedSentence = new String(receivePacket.getData());
        System.out.println("Texto recebido do servidor:" + modifiedSentence);

        clientSocket.close();
        System.out.println("Socket cliente fechado!");
    }

}

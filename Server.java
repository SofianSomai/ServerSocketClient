/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.possibiliscenarisomai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itis Volta Portatile
 */
public class Server {
    
    ServerSocket SS;
    Socket SO;
    BufferedReader br;
    BufferedWriter bw;
    
    
    public Server (int porta)
    {
        try {
            SS = new ServerSocket(porta);
            System.out.println("ok il server è in ascolto");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void inAscolto()
    {
        try {
            SO = SS.accept();
            System.out.println("connesione stabilita con successo");
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   /* public void Scrivi(String messaggio){
    try{
        bw = new BufferedWriter(so)
    }
    }*/
    


}
    
    
     
    
    


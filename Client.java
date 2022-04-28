/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.possibiliscenarisomai;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Itis Volta Portatile
 */
public class Client {
    
    Socket so;
    BufferedReader br;
    BufferedWriter bw;
    
    public Client(InetAddress ip, int porta){
      
        
        try { 
           
            so = new Socket(ip, porta);
            br = new BufferedReader(new InputStreamReader(so.getInputStream()));
        } catch (IOException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String leggi(){
        
      String msq="";
      try{
      msq = br.readLine();
        } catch (IOException eIoException){
        Logger.getLogger(Client.class.getName());
        }
          return msq;

    }

}
    
   
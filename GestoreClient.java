/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.possibiliscenarisomai;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itis Volta Portatile
 */
public class GestoreClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        try {
          Client cli = new Client(InetAddress.getLocalHost(),2000);  
            String str = cli.leggi();
            System.out.println(str);
        } catch (UnknownHostException ex) {
            Logger.getLogger(GestoreClient.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
}

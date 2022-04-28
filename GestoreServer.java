/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.possibiliscenarisomai;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Itis Volta Portatile
 */
public class GestoreServer {

    public static void main(String[] args) {
     
        Server srv = null;
            srv = new Server(2000);
        
        srv.inAscolto();

  
    }
}

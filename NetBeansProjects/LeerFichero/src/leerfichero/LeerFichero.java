/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerfichero;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class LeerFichero {

    public static void main(String[] args) throws IOException {
        
        /*
        //Ruta del ejecutable de Google Chrome
        String RUTA_ARCHIVO = "C:\\Users\\Usuario\\Desktop\\nueva\\prueba";
        //Cerramos el proceso
        ProcessBuilder pb = new ProcessBuilder("notepad", RUTA_ARCHIVO);
        Process p = pb.start();
        */
       
        Process pr = Runtime.getRuntime().exec("notepad C:\\Users\\Usuario\\Desktop\\nueva\\prueba");           
        
    }
    
}

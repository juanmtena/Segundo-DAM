/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iniciandoprocesos;

import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class IniciandoProcesos {

    public static void main(String[] args) {
        //Ruta del ejecutable de Microsoft Egdge
        String RUTA_PROCESO = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
        //Creamos el proceso de Microsoft Edge
        //ProcessBuilder pb = new ProcessBuilder(RUTA_PROCESO);
        Runtime runtime = Runtime.getRuntime();
        try{
            //Lanzamos el proceso
            //Process process = pb.start();
            Process pr = Runtime.getRuntime().exec(RUTA_PROCESO);
            //Obtenemos su estado de ejecución
            //int retorno = process.waitFor();
            //System.out.println("La ejecucion de " + RUTA_PROCESO + " devuelve " + retorno);
        } catch (IOException ex) {
            System.err.println("Error: " + ex.toString());
            System.exit(-1);    
        }
    }
    
}

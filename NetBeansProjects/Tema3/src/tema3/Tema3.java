package tema3;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //winrar();
        //time();
        //error();
        guardarTime();
        
    }
    
    public static void winrar() {
    
        //Ruta del ejecutable de Google Chrome
        String RUTA_ACCESO = "C:\\Program Files\\WinRAR\\WinRAR.exe";
        //Cerramos el proceso
        ProcessBuilder pb = new ProcessBuilder(RUTA_ACCESO);
        Scanner teclado = new Scanner(System.in);
        
        try{
            //Lanzamos el proceso
            Process process = pb.start();
            System.out.println("¿Terminar el proceso? (S/N)");
            if(teclado.nextLine().toUpperCase().charAt(0) == 'S') {
                //Destruimos el proceso            
                process.destroy();
            }
        } catch(IOException ex) {
            System.out.println("Error" + ex.toString());
            System.exit(-1);
        }
    
    }
    
    public static void time() {
        //Cerramos el proceso
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "time");
    
        try{
            //Lanzamos el proceso
            Process process = pb.start();
            InputStream i = process.getInputStream();
            int numero = i.read();
            char c = (char)numero;
            while(numero != -1) {
                System.out.print(c);
                numero = i.read();
                c = (char)numero;
            }
        } catch(IOException ex) {
            System.err.println("Error" + ex.toString());
            System.exit(-1);
        }
    }
    
    public static void error() throws IOException{
        //Cerramos el proceso
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "askdjah");
    
            //Lanzamos el proceso
            Process process = pb.start();
            InputStream i = process.getErrorStream();
            int numero = i.read();
            char c = (char)numero;
            while(numero != -1) {
                System.out.print(c);
                numero = i.read();
                c = (char)numero;
            }
        i.close();
    }
    
    public static void errorString() throws IOException{
        //Cerramos el proceso
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "askdjah");
        String error = "";
        
            //Lanzamos el proceso
            Process process = pb.start();
            InputStream i = process.getErrorStream();
            
            int numero = i.read();
            char c = (char)numero;
            while(numero != -1) {
                error += c;
                System.out.print(error);
                numero = i.read();
                c = (char)numero;
            }
        i.close();
    }
    
    public static void guardarTime() throws IOException {
        
        ProcessBuilder pb = new ProcessBuilder("cmd", "/C", "time > proceso.txt");
    
        Process process = pb.start();
        
    }
    
    
}

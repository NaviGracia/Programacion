package Ejercicio1;

import java.io.FileReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            final String rutaFichero = "holamundo.txt";
            FileReader fr = new FileReader(rutaFichero);
            int valorASCII = fr.read();
            while (valorASCII!=-1) {
                if (valorASCII!=32) {
                    System.out.print((char)valorASCII);
                }    
                valorASCII=fr.read();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
}
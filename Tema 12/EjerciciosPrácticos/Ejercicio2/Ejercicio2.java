package Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio2 {
    static public void Escritura(File file1, String texto) throws Exception{
        try {
            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(texto);
            bw.close();
            fw.close();    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fallo de Escritura de Archivo");
        }
        
    }

    static public void Mostrar(File file1){
        try {
            FileReader fr = new FileReader(file1); //El fallo esta aqui
            BufferedReader br = new BufferedReader(fr);
            int valorASCII = br.read();
            while (valorASCII!=-1) {
                char character = (char)valorASCII;
                if ((character>64)&&(character<91)) {
                   character+=32;
                } else if ((character>96)&&(character<123)) {
                   character-=32;
                }
                System.out.print(character);
                valorASCII = br.read();
            }
            br.close();
            fr.close();    
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Fallo de Lectura de Archivo");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese la ruta del archivo a leer:");
            String ruta = sc.nextLine();
            File file1 = new File(ruta);
            System.out.println("Inserte el texto que desea escribir en el archivo:");
            String texto = sc.nextLine(); 
            Escritura(file1, texto);
            Mostrar(file1);
            System.out.println(" ");
            System.out.println("Programa Finalizado");   
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error Controlado");
        }
     

    }
    
}
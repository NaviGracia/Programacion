package Ejercicio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LecturaArchivo {
    static public void Escritura(File file1, String ruta, String texto) throws Exception{
        FileWriter fw = new FileWriter(file1);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(texto);
        bw.close();
        fw.close();
    }

    static public void Mostrar(String ruta){
        FileReader fr = new FileReader(ruta); //El fallo esta aqui
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
        br.close();
        fr.close();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Ingrese la ruta del archivo a leer:");
            String ruta = sc.nextLine();
            File file1 = new File(ruta);
            System.out.println("Inserte el texto que desea escribir en el archivo:");
            String texto = sc.nextLine();
            Escritura(file1, ruta, texto);
            Mostrar(ruta);
            System.out.println("Programa Finalizado");   
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error Controlado");
        }
     

    }
    
}
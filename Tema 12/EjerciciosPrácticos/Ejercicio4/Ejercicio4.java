
import java.io.*;
import java.util.Scanner;
 
public class Ejercicio4 {
    static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        System.out.println("Inserte la ruta de origen");
        String origen= sc.nextLine();
        System.out.println("Inserte la ruta de destino");
        String destino=sc.nextLine();
 
        copiaFicheros(origen, destino);
 
    }
    public static void copiaFicheros (String origen, String destino){
 
        try(FileInputStream fis=new FileInputStream(origen);
                FileOutputStream fos=new FileOutputStream(destino)){
 
                byte byteA[]=new byte[fis.available()];
 
                fis.read(byteA);
 
                fos.write(byteA);
 
        }catch(IOException e){
            System.out.println("Error");
        }
    }
 
}

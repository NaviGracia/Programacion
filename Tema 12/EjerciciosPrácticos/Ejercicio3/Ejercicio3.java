
import java.io.*;
import java.util.Scanner;

public class Ejercicio3 {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        
        System.out.println("Ingresa la primera ruta:");
        String rutaFichero1= sc.nextLine();
        System.out.println("Ingresa la segunda ruta:");
        String rutaFichero2= sc.nextLine();
        System.out.println("Ingresa la ruta destino:");
        String rutaDestino= sc.nextLine();
 
        File fichero1=new File(rutaFichero1);
        File fichero2=new File(rutaFichero2);
 
        String primerFichero=fichero1.getName().substring(0, fichero1.getName().length()-4);
 
        String nombreFicheroFinal=primerFichero+"_"+fichero2.getName();
 
        rutaDestino+=nombreFicheroFinal;
 
        File destino=new File(rutaDestino);
 
        UneFicheros(fichero1, fichero2, destino);
 
    }
 
    public static void UneFicheros (File fich1, File fich2, File destino){
 
        try (BufferedReader br=new BufferedReader(new FileReader(fich1));
            BufferedReader br2=new BufferedReader(new FileReader(fich2))){
 
            int eleccion=-1;
 
            if(destino.exists()){
                System.out.println("El fichero ya existe, desea sobreescribirlo? 1 = Si | 2 = No");
                eleccion=sc.nextInt();
            }
            if(eleccion!=2){
 
                BufferedWriter bw=new BufferedWriter(new FileWriter(destino));
                copiar(bw, br);
                copiar(bw, br2);
 
            }
        }catch(IOException e){
            System.out.println("Error");
        }
 
    }
 
    private static void copiar(BufferedWriter bw, BufferedReader br) throws IOException{
 
            String linea=br.readLine();
            while(linea!=null){
 
                bw.write(linea);
 
                linea=br.readLine();
            }
 
    }
}

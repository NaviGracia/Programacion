
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


 
public class Ejercicio5 {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
 
        String ruta= sc.nextLine();
        String numeros= sc.nextLine();
        int numNumerosAleatorios=Integer.parseInt(numeros);
 
        try(DataOutputStream dos=new DataOutputStream (new FileOutputStream (ruta, true));
            DataInputStream dis=new DataInputStream(new FileInputStream (ruta))){
 
            escribeFichero(dos, numNumerosAleatorios);
            leeFichero(dis);
 
        }catch(EOFException e){
            System.out.println("Fin del fichero");
        }catch(IOException e){
            System.out.println("Error");
        }
    }
    public static void escribeFichero (DataOutputStream dos, int numNumerosAleatorios) throws IOException{
 
 
            for (int i=0;i<numNumerosAleatorios;i++){
                int numero=generaNumerosAleatorios();
                dos.writeInt(numero);
            }

            dos.flush();
 
    }
 
    public static void leeFichero (DataInputStream dis) throws IOException{
 
            while(true){
                System.out.println(dis.readInt());
            }
    }
 
    public static int generaNumerosAleatorios(){
        int numero=(int)Math.floor(Math.random()*101);
        return numero;
    }
 
}

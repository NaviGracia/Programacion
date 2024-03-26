
import java.io.*;
import java.util.Scanner;
 
public class Ejercicio6 {
    static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
 
        final String RUTA="vehiculos.ddr";
        System.out.println("Introduce la matricula:");
        String matricula=sc.nextLine();
        System.out.println("Introduce la matricula:");
        String marca=sc.nextLine();
        System.out.println("Introduce la matricula:");
        String texto=sc.nextLine();
        System.out.println("Introduce el tamaño del deposito:");
        double tamañoDeposito=Double.parseDouble(texto);
        System.out.println("Introduce la matricula:");
        String modelo=sc.nextLine();
 
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(RUTA,true));
                DataInputStream dis=new DataInputStream(new FileInputStream(RUTA))){
 
            introduceDatos(dos, matricula, marca, tamañoDeposito, modelo);
 
            muestraDatos(dis);
        }catch(EOFException e){
 
        }catch(IOException e){
            System.out.println("Error");
        }
 
    }
 
    public static void introduceDatos(DataOutputStream dos, String matricula, String marca, double tamañoDeposito, String modelo) throws IOException{
 
        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeDouble(tamañoDeposito);
        dos.writeUTF(modelo);
 
    }
 
    public static void muestraDatos(DataInputStream dis) throws IOException {
 
        //Cuando se acaba el fichero saltara la excepcion
        while(true){
            System.out.println("El vehiculo tiene una matricula "+dis.readUTF()+
            ", su marca es "+dis.readUTF()+", el tamaño del deposito es de "+dis.readDouble()+" " +
            "litros y su modelo es "+dis.readUTF());
        }
    }
 
}

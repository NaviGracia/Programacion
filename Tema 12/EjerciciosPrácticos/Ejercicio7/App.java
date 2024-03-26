import java.io.*;
import java.util.Scanner;
 
public class App {
    static Scanner sc = new Scanner(System.in); 
 
    public static void main(String[] args) {
        
        File fichero=new File("D:\\vehiculos.ddr");
 
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
 
        try{
 
            Vehiculo vehiculo=new Vehiculo(matricula, marca, tamañoDeposito ,modelo);
 
            if(fichero.exists()){
                MiObjeto moos=new MiObjeto(new FileOutputStream(fichero, true));
                moos.writeObject(vehiculo);
                moos.close();
            }else{
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(vehiculo);
                oos.close();
            }
 
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
            muestraDatos(ois);
 
        }catch(ClassNotFoundException e){
 
        }catch(EOFException e){
            System.out.println("fin");
        }catch(IOException e){
            System.out.println("Error");
        }
    }
 
    public static void muestraDatos(ObjectInputStream ois) throws IOException, ClassNotFoundException {
 
        while(true){
            Vehiculo ref=(Vehiculo)ois.readObject();
            System.out.println("El vehiculo tiene una matricula "+ref.getMatricula()+
            ", su marca es " + ref.getMarca()+ " y su modelo es "+ref.getModelo());
        }
    }
 
}
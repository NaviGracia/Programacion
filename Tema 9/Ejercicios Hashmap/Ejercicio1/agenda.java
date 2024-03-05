package Ejercicio1;

import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;

public class agenda {
    static Scanner sc = new Scanner(System.in);
    static HashMap<Integer, String> agenda = new HashMap<>(); 
    static HashMap<String, Integer> agendaAlReves = new HashMap<>();
    static int numCont;

    public static void agendarContacto(){
        System.out.println("Inserte el nº de telefono:");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Inserte el nombre:");
        String nombre = sc.nextLine();
        agenda.put(numero, nombre);
        agendaAlReves.put(nombre, numero);
        numCont+=1; 
    }

    public static void consultarTelefono(){
        System.out.println("Inserte el nombre del contacto");
        String nombreBuscar = sc.nextLine();
        System.out.println("Nombre: " + nombreBuscar + "\n Teléfono: " + agendaAlReves.get(nombreBuscar));
    }

    public static void eliminarPersona(String dni){
        System.out.println();
    }

    public static void ordenarPersona(){
        System.out.println();
    }

    public static void listarPersona(){
        
    }

    public static void main(String[] args) {
        int eleccion;
        do {
            System.out.println("Menú Acciones: ");
            System.out.println("1. Agendar contacto.");
            System.out.println("2. Nº de contactos.");
            System.out.println("3. Buscar teléfono de un contacto.");
            System.out.println("4. Modificar contacto.");
            System.out.println("5. Buscar contacto de un teléfono.");
            System.out.println("6. Borrar contacto.");
            System.out.println("7. Listar contactos.");
            System.out.println("8. Listar nombres contactos.");
            System.out.println("9. Ordenar agenda por nombre.");
            System.out.println("10. Ordenar agenda por teléfono.");
            System.out.println("11. Salir.");
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion) {
                case 1:
                    agendarContacto();
                    break;
                case 2:
                    System.out.println(agenda.size()); 
                    break;
                case 3:
                    consultarTelefono();
                    break;
                case 4:
                
                    break;
                case 5:
                
                    break;
                case 6:
                
                    break;
                case 7:
                
                    break;
                case 8:
                
                    break;
                case 9:
                
                    break;
                case 10:
                
                    break;
                case 11:
                    System.out.println("Programa Finalizado");
                    break;
            }
        } while (eleccion != 11);
    }
}

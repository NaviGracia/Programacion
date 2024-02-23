package Ejercicio1;

import java.util.Scanner;

public class agenda {
    static Scanner sc = new Scanner(System.in);
    //  static 

     public static void menuAcciones(){
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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
                
                    break;
            }
        } while (eleccion != 11);
     }

    public static void agendarContacto(String dni){
        System.out.println();
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
        menuAcciones();
    }
}

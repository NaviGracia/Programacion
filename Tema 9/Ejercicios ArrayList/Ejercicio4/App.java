package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class App {
     static Scanner sc = new Scanner(System.in);
     static ArrayList<Persona> personas = new ArrayList<>();

     public static void introducirPersonas(){
        String nombre;
        do{
            System.out.println("Introduzca el Nombre de la persona(No introduzca nada para acabar el programa):");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("")) {
                System.out.println("Introduzca el dni: ");
                String dni = sc.nextLine();
                System.out.println("Introduzca primer apellido: ");
                String apellido1 = sc.nextLine();
                System.out.println("Introduzca segundo apellido: ");
                String apellido2 = sc.nextLine();
                System.out.println("Introduzca la edad: ");
                int edad = sc.nextInt();
                System.out.println("Introduzca su peso: ");
                double peso = sc.nextDouble();
                System.out.println("Introduzca su sexo (H = Hombre, M = Mujer, por defecto N = Nada): ");
                char sexo = sc.next().charAt(0);
                personas.add(new Persona(dni, nombre, apellido1, apellido2, edad, peso, sexo));
            }
        }while(!nombre.equalsIgnoreCase(""));
     }

     public static void menuAcciones(){
        System.out.println("Menú Acciones: ");
        System.out.println("1. Buscar personas por DNI");
        System.out.println("2. Eliminar personas por DNI");
        System.out.println("3. Ordenar por apellidos");
        System.out.println("4. Mostrar personas");
        int eleccion = sc.nextInt();
        sc.nextLine();
        switch (eleccion) {
            case 1:
                System.out.println("Introduzca el dni: ");
                buscarPersona(sc.nextLine());
                break;
            default:
                break;
        }
     }

    public static void buscarPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                System.out.println(personas.get(i).toString());
            }
        }
    }

    public static void main(String[] args) {
        introducirPersonas();        
        menuAcciones();
    }
}

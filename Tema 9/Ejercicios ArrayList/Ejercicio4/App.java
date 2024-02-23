package Ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
     static Scanner sc = new Scanner(System.in);
     static ArrayList<Persona> personas = new ArrayList<>();

     public static void introducirPersonas(){
        String nombre = "";
        do{
            System.out.println("Introduzca el Nombre de la persona (Introduzca nada para acabar el programa):");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("nada")) {
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
                sc.nextLine();
                personas.add(new Persona(dni, nombre, apellido1, apellido2, edad, peso, sexo));
            }
        }while(!nombre.equalsIgnoreCase("nada"));  
     }

     public static void menuAcciones(){
        int eleccion;
        do {
            System.out.println("Menú Acciones: ");
            System.out.println("1. Buscar personas por DNI");
            System.out.println("2. Eliminar personas por DNI");
            System.out.println("3. Ordenar por apellidos");
            System.out.println("4. Mostrar personas");
            System.out.println("5. Salir");
            eleccion = sc.nextInt();
            sc.nextLine();
            switch (eleccion) {
                case 1:
                    System.out.println("Introduzca el dni: ");
                    buscarPersona(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Introduzca el dni: ");
                    eliminarPersona(sc.nextLine());
                    break;
                case 3:
                    System.out.println("Ordenando personas");
                    for (int index = 1; index < personas.size(); index++) {
                        ordenarPersona(personas.get(index), personas.get(index-1));
                    }
                    
                    System.out.println("Ordenación Completada");
                    break;
                case 4:
                    System.out.println("Listando Personas:");
                    listarPersona();
                    break;
                default:
                    break;
            }
        } while (eleccion != 5);
     }

    public static void buscarPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                System.out.println(personas.get(i).toString());
            }
        }
    }

    public static void eliminarPersona(String dni){
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                System.out.println(personas.remove(i));
                System.out.println("Persona Eliminada.");
            }
        }
    }

    public static void ordenarPersona(Persona p1, Persona p2){
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2){
                return p1.getApellido1().compareTo(p2.getApellido1());
            }
        });
    }

    public static void listarPersona(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    public static void main(String[] args) {
        introducirPersonas();
        menuAcciones();
    }
}

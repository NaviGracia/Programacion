package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    static ArrayList<Integer> arrayEnteros = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numElegido = 0;
        do{
            System.out.println("Menú Acciones ArrayList: " + "\n 1. Agregar Nº" + "\n 2. Buscar Nº" + "\n 3. Modificar un Nº" + "\n 4. Eliminar un Nº" + "\n 5. Insertar un Nº en una posición dada" + "\n 6. Mostrar los elementos" + "\n 7. Ordenar Asc." + "\n 8. Ordenar Desc." + "\n 9. Salir" + "\n Introduzca Acción (1-9)");
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Introduzca el Nº a insertar:");
                    int num = sc.nextInt();
                    arrayEnteros.add(num);
                    break;
                case 2:
                    System.out.println("Introduzca el Nº que desea buscar:");
                    int numBuscar = sc.nextInt();
                    arrayEnteros.indexOf(numBuscar);
                    break;
                case 3:
                    System.out.println("Introduzca el Nº que desea modificar:");
                    int numRemplazar = sc.nextInt();
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
            
                default:
                    System.out.println("Nº Incorrecto");
                    break;
            }
        }while(numElegido!=9);
    }
}

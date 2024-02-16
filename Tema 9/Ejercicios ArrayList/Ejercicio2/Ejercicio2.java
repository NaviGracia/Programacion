package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
                    int numReemplazar = sc.nextInt();
                    int pos = arrayEnteros.indexOf(numReemplazar);
                    System.out.println("Introduzca el Nº nuevo:");
                    int sust = sc.nextInt();
                    arrayEnteros.set(pos, sust);
                    break;
                case 4:
                    System.out.println("Introduzca el Nº a eliminar:");
                    int elimi = sc.nextInt();
                    arrayEnteros.remove(arrayEnteros.indexOf(elimi));
                    break;
                case 5:
                    System.out.println("Introduzca la posicion:");
                    int posicion = sc.nextInt();
                    try {
                        arrayEnteros.get(posicion);   
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("Error");
                        break;
                    }
                    System.out.println("Introduzca el Nº:");
                    int n = sc.nextInt();
                    arrayEnteros.add(posicion, n);
                    break;
                case 6:
                    try {
                        System.out.println("Lista de Valores:");
                        for(int cont = 0; cont <= arrayEnteros.size(); cont++){
                            System.out.println(arrayEnteros.get(cont));
                        }    
                    } catch (Exception e) {
                        // TODO: handle exception
                        System.out.println("La lista está vacía");
                    }
                    break;
                case 7:
                    Collections.sort(arrayEnteros);
                    System.out.println("Lista Ordenada de menor a mayor");
                    break;
                case 8:
                    Comparator<Integer> comparador = Collections.reverseOrder();
                    Collections.sort(arrayEnteros, comparador);
                    break;
                default:
                    System.out.println("Nº Incorrecto");
                    break;
            }
        }while(numElegido!=9);
    }
}

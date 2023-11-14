package eje4;

import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[4][4];
        for(int linea = 0; linea<matriz.length; linea++){
            for(int columna = 0; columna<matriz.length; columna++){
                System.out.println("Introduzca el Nº para la coordenada de la matriz [" + linea + "] [" + columna + "]:");
                matriz[linea][columna]=sc.nextInt();
            }
        }

        for(int linea = 0; linea<matriz.length; linea++){
            for(int columna = 0; columna<matriz.length; columna++){
                System.out.print(matriz[linea][columna] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Elija la fila que desea sumar (de la 0 a la 3):");
        int lineaDeseada = sc.nextInt();
        int sumaLinea = 0;
        if (lineaDeseada>matriz.length) {
            System.out.println("Linea no existente");
        } else{
            for(int columna = 0; columna<matriz.length; columna++){
                sumaLinea+=matriz[lineaDeseada][columna];
            }
        }
        System.out.println("La suma de la linea pedida es: " + sumaLinea);

        System.out.println("Elija la columna que desea sumar (de la 0 a la 3):");
        int columnaDeseada = sc.nextInt();
        int sumaColumna = 0;
        if (columnaDeseada>matriz.length) {
            System.out.println("Columna no existente");
        } else{
            for(int linea = 0; linea<matriz.length; linea++){
                sumaColumna+=matriz[linea][columnaDeseada];
            }
        }
        System.out.println("La suma de la columna pedida es: " + sumaColumna);
        
        int sumaDiagonalPrincipal = 0;
        for(int linea = 0; linea<matriz.length; linea++){
            for(int columna = 0; columna<matriz.length; columna++){
                if (linea==columna) {
                    sumaDiagonalPrincipal+=matriz[linea][columna];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es:" + sumaDiagonalPrincipal);

        int sumaDiagonalInvertida = 0;
        for(int linea = 0; linea<matriz.length; linea++){
            for(int columna = 0; columna<matriz.length; columna++){
                if (linea+columna==3) {
                    sumaDiagonalInvertida+=matriz[linea][columna];
                }
            }
        }
        System.out.println("La suma de la diagonal invertida es:" + sumaDiagonalInvertida);

        int sumaTodo = 0;
        for(int linea = 0; linea<matriz.length; linea++){
            for(int columna = 0; columna<matriz.length; columna++){
                    sumaTodo+=matriz[linea][columna];
                
            }
        }
        System.out.println("La suma total es:" + sumaTodo);
    }
}
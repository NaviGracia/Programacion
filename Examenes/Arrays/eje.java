package eje;

import java.util.Arrays;
import java.util.Scanner;

public class eje {
    /*2-. R: Considero regular porque no he utilizado el Math.random entre dos rangos, y he utilizado este sistema para parchearlo, 
    generando un numero entre 1 a 100, y si de ese numero salia uno menor a 50 que en el array generará un nº entre 2 a 5, y en caso
    de ser mayor que 50, generarlo entre 7 a 12*/
    public static int[][] crearArray(int filas, int columnas){
        int[][] arrayBidimensional;
        arrayBidimensional = new int[filas][columnas];
        for(int contFilas = 0; contFilas<filas; contFilas++){
            for(int contColum = 0; contColum<columnas; contColum++){
                int nAleatorio = (int)(Math.random()*100)+1;
                if(nAleatorio<50){
                    arrayBidimensional[contFilas][contColum] = (int)(Math.random()*(6-2)+2);
                } else{
                    arrayBidimensional[contFilas][contColum] = (int)(Math.random()*(13-7)+7);
                }
            }
        }
        return arrayBidimensional;
    } 
/*3-. B */
    public static void mostrarFigura(int[][] arrayBidimensional, int filas, int columnas){
        for(int contFilas = 0; contFilas<filas; contFilas++){
            for(int contColum = 0; contColum<columnas; contColum++){
                System.out.print(arrayBidimensional[contFilas][contColum] + " ");
            }
            System.out.println();
        }
    }

    public static void ordenar(int[][] arrayBidimensional, int ordenacion){
        if (ordenacion==1) {
            java.util.Arrays.sort(arrayBidimensional); 
            System.out.println("Array ordenado: " + Arrays.toString(arrayBidimensional));
        }
    }

    public static int[][] eliminarValor(int[][] arrayBidimensional, int eliminarValor, int filas, int columnas){
        for(int contFilas = 0; contFilas<filas; contFilas++){
            for(int contColum = 0; contColum<columnas; contColum++){
                if (arrayBidimensional[contFilas][contColum]==eliminarValor) {
                    int[][] arrayEliminado;
                    arrayEliminado = new int[-1][col]
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*1-. B */
        int opcElegida = 0;
        int comprobar1Vez = 0;
        int[][] arrayBidimensional = new int[0][0];
        int filas = 0;
        int columnas = 0;
        do{
            System.out.println("Menú de Operaciones con Arrays: ");
            System.out.println("1-. Crea un array bidimensional y rellénalo de enteros aleatoriamente");
            System.out.println("2-. Ordena los arrays");
            System.out.println("3-. Muestra el contenido del array como una figura");
            System.out.println("4-. Elimina todos los elementos de un valor");
            System.out.println("5-. Salir");
            System.out.println("Que opción desea elegir? (Si es su primera vez, primero crealo, de lo contrario, no podrá continuar)");
            opcElegida = sc.nextInt();
            if (opcElegida == 1) {
                comprobar1Vez = 1;
            }
            if (comprobar1Vez!=1&&opcElegida!=5) {
                System.out.println("Lo siento, para operar, necesita crear el array (Opción 1)");
            } else{
                switch (opcElegida) {
                /*2-. R: Explicado en la función */
                case 1:
                    System.out.println("Ingrese las filas del array: ");
                    filas = sc.nextInt();
                    System.out.println("Ingrese las columnas del array: ");
                    columnas = sc.nextInt();
                    arrayBidimensional = crearArray(filas, columnas);
                    break;
                    
                case 2:
                    System.out.println("Como desea ordenarlo: Ascendente(1) o Descendente(2)?");
                    int ordenacion = sc.nextInt();
                    ordenar(arrayBidimensional, ordenacion);
                    break;
                /*3-. B */
                case 3:
                    
                    mostrarFigura(arrayBidimensional, filas, columnas);
                    break;
                
                case 4:
                    System.out.println("Que valor desea eliminar del array?");
                    int numEliminar= sc.nextInt();
                    break;
            }
            }
            
            
        }while(opcElegida!=5);
        System.out.println("Programa Finalizado");
    }
}
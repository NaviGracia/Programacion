package eje5;

import java.util.Scanner;

public class eje5 {
    static int[] v;
    static int lon;

   /*  public asignarDatos(int[] v){
        for(int posicion = 0; posicion<v.length; posicion++){

    }*/

    public static int solicitarTamanyo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la longitud que desea del array:");
        lon = sc.nextInt();
        return lon;
    }

    public static int asignarDatos(){
        int resultado = (int)(Math.random()*100)+1;
        return resultado;
    }

    public static int maximo(){
        int posicion;
        int mayor = 0;
        for(posicion = 0; posicion<v.length; posicion++){
            int nMaximoInicial=v[0];
            if ((v[posicion]>nMaximoInicial)&&(v[posicion]>v[mayor])) {
                mayor = posicion;
            }
        }
        return mayor;
    }

    public static int minimo(){
        int posicion;
        int minimo = 0;
        for(posicion = 0; posicion<v.length; posicion++){
            int nMinimoInicial=v[0];
            if ((v[posicion]<nMinimoInicial)&&(v[posicion]<v[minimo])) {
                minimo = posicion;
            }
        }
        return minimo;
    }

    public static int[] insertar(int pos, int num){
        int[] nuevoV = new int[v.length+1];
        System.arraycopy(v, 0, nuevoV, 0, pos);
        nuevoV[pos] = num;
        System.arraycopy(v, pos, nuevoV, pos+1, v.length-pos);
        int[] vFinal = new int[nuevoV.length-1];
        pos = vFinal.length;
        System.arraycopy(nuevoV, 0, vFinal, 0, pos);
        System.arraycopy(nuevoV, pos+1, vFinal, pos, vFinal.length-pos);
        return vFinal;
    }

    public static void mostrarVector(int[] vFinal){
        for(int posicion = 0; posicion<vFinal.length; posicion++){
            System.out.println(vFinal[posicion]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Método solicitarTamanyo() */
        v = new int [solicitarTamanyo()];
        System.out.println("La longitud establecida al vector es de " + v.length);

        /*Método asignarDatos() */
        for(int posicion = 0; posicion<v.length; posicion++){
            v[posicion] = asignarDatos();
            System.out.println("Nº" + posicion + ": " + v[posicion]);
        }

        /*Método maximo() */
        int nMaximo = maximo();
        System.out.println("El Nº más alto generado es: " + v[nMaximo]);

        /*Método minimo() */
        int nMinimo = minimo();
        System.out.println("El Nº más bajo generado es: " + v[nMinimo]);

        /*Método insertar(int pos, int num) */
        System.out.println("Inserte la posición en la que desea introducir el Nº: ");
        int pos = sc.nextInt();
        System.out.println("Inserte el nº a introducir: ");
        int num = sc.nextInt();
        int[] vFinal = insertar(pos, num);
        /*Método mostrarVector() */
        System.out.println("Mostrando vector final:");
        mostrarVector(vFinal);
    }
}
package eje2;

public class eje2 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[100];
        int menor = 999999999;
        int mayor = -99999999;
        int suma = 0;
        for(int posicion = 0; posicion < numeros.length; posicion++){
            numeros[posicion]=(int)(Math.random()*71)+10;
            suma+=numeros[posicion];
            if (numeros[posicion]<menor) {
                menor=numeros[posicion];
            }if (numeros[posicion]>mayor) {
                mayor = numeros[posicion];
            }
        }
        int media = suma/numeros.length;
        System.out.println("Mayor Nº Generado: " + mayor);
        System.out.println("Menor Nº Generado: " + menor);
        System.out.println("Media: " + media);
    }
}
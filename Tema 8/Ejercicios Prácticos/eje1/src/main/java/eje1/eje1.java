package eje1;

public class eje1 {
    public static void main(String[] args) {
        int[] numero;
        numero = new int[100];
        int nCorrespondiente = 1;
        int suma = 0;
        for(int posicion = 0; posicion<numero.length; posicion++){
            numero[posicion]=nCorrespondiente;
            nCorrespondiente++;
            suma+= numero[posicion];
            System.out.print(numero[posicion]+ " ");
        }
        double media = suma/numero.length;
        System.out.println("");
        System.out.println("Suma = " + suma);
        System.out.println("Media = " + media);
    }
}
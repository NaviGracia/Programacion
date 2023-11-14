package eje3;

public class eje3 {
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[5][8];
        for(int lineas = 1; lineas<5; lineas++){
            for(int columnas = 1; columnas<8; columnas++){
                matriz[lineas][columnas] = (int)(Math.random()*100)+1;
                System.out.print(matriz[lineas][columnas] + " ");
            }
            System.out.println("");
        }
    }
}
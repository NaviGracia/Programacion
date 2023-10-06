package eje9;

public class eje9 {
    public static void main(String[] args) {
        int edad = 20;
        int nivel_estudios = 4;
        int ingresos = 30000;
        boolean jasp = false;
        jasp = (edad <= 28) && (nivel_estudios > 3) && (ingresos > 28000);
        System.out.println(jasp);
    }
}
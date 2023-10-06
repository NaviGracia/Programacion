package eje5;

public class Main {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[2]);
        switch(args[1]){
            case "+": System.out.println("La suma de " +  x + " + " + y + " es " + (x + y));
            break;
            case "-": System.out.println("La resta  de " + x + " - " + y + " es " + (x - y));
            break;
            case "por": System.out.println("La multiplicación de " + x + " * " + y + " es " + (x * y));
            break;
            case "/": System.out.println("La división de " +  x + " / " + y + " es " + (x / y));
            break;
            case "^": System.out.println("La potencia de " +  x + " elevado a " + y + " es " + (Math.pow(x,y)));
            break;
        }
    }
}
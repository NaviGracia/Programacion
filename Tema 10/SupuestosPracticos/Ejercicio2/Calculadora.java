package SupuestosPracticos.Ejercicio2;

public class Calculadora{
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        try {
             x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[2]); 
        } catch (Exception e) {
            System.out.println("Datos introducidos incorrectos");
        }
        switch(args[1]){
            case "+": System.out.println("La suma de " +  x + " + " + y + " es " + (x + y));
            break;
            case "-": System.out.println("La resta  de " + x + " - " + y + " es " + (x - y));
            break;
            case "por": System.out.println("La multiplicación de " + x + " * " + y + " es " + (x * y));
            break;
            case "/": 
                try {
                    
                    if (y == 0) 
                        throw new ExcepcionDivisionCero();
                    else
                        System.out.println("La división de " +  x + " / " + y + " es " + (x / y));          
                } catch (ExcepcionDivisionCero ex1) {
                    System.out.println(ex1.getMessage());
                }  
                
            break;                
            case "^": System.out.println("La potencia de " +  x + " elevado a " + y + " es " + (Math.pow(x,y)));
            break;
        }
        System.out.println("mi programa continuó");
    }
    
}

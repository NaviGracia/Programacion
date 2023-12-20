package Raices;

public class Raices {
    private double a;
    private double b;
    private double c; 

    Raices(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    void obtenerRaices(){
        double raiz1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Raiz Nº1: " + raiz1);
        double raiz2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Raiz Nº1: " + raiz2);
    }

    void obtenerRaiz(){
        double raiz = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("Raiz: " + raiz);
    }

    double getDiscriminante(){
        return (b*b)-4*a*c;
    }

    boolean tieneRaices(){
        if (getDiscriminante()>0) {
            return true;
        } else{
            return false;
        }
    }

    boolean tieneRaiz(){
        if (getDiscriminante()==0) {
            return true;
        } else{
            return false;
        }
    }

    void calcular(){
        if (tieneRaices()==true) {
            obtenerRaices();
        } if (tieneRaiz()==true) {
            obtenerRaiz();
        } else{
            System.out.println("No existe solución");
        }
    }
}

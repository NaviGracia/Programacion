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
        boolean dosRaices = false;
        if (getDiscriminante()>0) {
            dosRaices=true;
        }
        return dosRaices;
    }

    boolean tieneRaiz(){
        boolean unaRaiz = false;
        if (getDiscriminante()==0) {
            unaRaiz=true;
        }
        return unaRaiz;
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

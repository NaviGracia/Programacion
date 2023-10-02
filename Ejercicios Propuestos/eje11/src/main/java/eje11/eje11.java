package eje11;

public class eje11 {
    public static void main(String[] args) {
        int e = 7859;
        int b500 = e/500;
        int b200 = (e - (500*b500))/200;
        int b100 = (e - ((500*b500)+(b200*200)))/100;
        int b50 = (e - ((500*b500) + (b200*200) + (b100*100)))/50;
        int b20 = (e - ((500*b500) + (b200*200) + (b100*100) + (b50*50)))/20;
        int b10 = (e - ((500*b500) + (b200*200) + (b100*100) + (b50*50) + (b20*20)))/10;
        int b5 = (e - ((500*b500) + (b200*200) + (b100*100) + (b50*50) + (b20*20) + (b10*10)))/5;
        int m2 = (e - ((500*b500) + (b200*200) + (b100*100) + (b50*50) + (b20*20) + (b10*10) + (b5*5)))/2;
        int m = e - ((500*b500) + (b200*200) + (b100*100) + (b50*50) + (b20*20) + (b10*10) + (b5*5) + (m2*2));
        System.out.println(e + "€ son organizados en:");
        System.out.println(b500 + " Billetes de 500€");
        System.out.println(b200 + " Billetes de 200€");
        System.out.println(b100 + " Billetes de 100€");
        System.out.println(b50 + " Billetes de 50€");
        System.out.println(b20 + " Billetes de 20€");
        System.out.println(b10 + " Billetes de 10€");
        System.out.println(b5 + " Billetes de 5€");
        System.out.println(m2 + " Monedas de 2€");
        System.out.println(m + " Monedas de 1€");
    }
}
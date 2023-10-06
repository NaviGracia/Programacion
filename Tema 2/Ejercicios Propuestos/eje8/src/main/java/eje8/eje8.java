package eje8;

public class eje8 {
    public static char getLetras(){
        return (char)(Math.random()*26 + 'a');
    }

    public static void main(String[] args) {
        if(getLetras()=='a'||getLetras()=='e'||getLetras()=='i'||getLetras()=='o'||getLetras()=='u'||getLetras()=='y') {
            System.out.println("La letra generada " + getLetras() + " es una vocal");
        } 
        else {        
            System.out.println("La letra generada " + getLetras() +  " es una consonante");
        }
    }
}
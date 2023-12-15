package Persona;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        



        //Pidiendo datos de la persona
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el edad:");
        int edad = sc.nextInt();
        System.out.println("Introduce el sexo:");
        char sexo = sc.next().charAt(0);
        System.out.println("Introduce el peso:");
        double peso = sc.nextDouble();
        System.out.println("Introduce la altura:");
        double altura = sc.nextDouble();
        //Creando 3 Personas
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona("Stevan", 40, 'H');
        p2.setPeso(70);
        p2.setAltura(1.4);
        Persona p3 = new Persona();
        p3.setNombre("Maca");
        p3.setPeso(75);
        p3.setAltura(1.84);
        //Peso ideal de las 3 personas (calcularIMC)
        System.out.println("-1 = Debajo de su peso ideal");
        System.out.println("0 = En su peso ideal");
        System.out.println("1 = Encima de su peso ideal");
        System.out.println("La persona " + p1.getNombre() + " tiene un: " + p1.calcularIMC(peso, altura));
        System.out.println("La persona " + p2.getNombre() + " tiene un: " + p2.calcularIMC(peso, altura));
        System.out.println("La persona " + p3.getNombre() + " tiene un: " + p3.calcularIMC(peso, altura));
        //esMayorDeEdad de las 3 personas
        System.out.println("La persona " + p1.getNombre() + " es mayor de edad: " + p1.esMayorDeEdad(edad));
        System.out.println("La persona " + p2.getNombre() + " es mayor de edad: " + p2.esMayorDeEdad(edad));
        System.out.println("La persona " + p3.getNombre() + " es mayor de edad: " + p3.esMayorDeEdad(edad));
        //Mostrar información de las personas
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    
}

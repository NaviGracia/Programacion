package Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Password p1 = new Password();
        System.out.println("Ingrese la longitud de la contraseña:");
        int lon = sc.nextInt();
        Password p2 = new Password(lon, null);
        System.out.println(p1.getpassword());
        System.out.println(p1.esFuerte(lon, null, null, null, null));
        System.out.println(p2.getpassword());
    }
}

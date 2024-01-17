package Ejercicio4;

public class App {
    public static void main(String[] args) {
        Frescos f1 = new Frescos(2, "02/06/2023", "03/02/2024", "España");
        Frescos f2 = new Frescos(5, "15/06/2022", "24/07/2023", "España");
        Refrigerados r1 = new Refrigerados(17, "17/11/2020", "11/10/2024", "Argentina", 120, -10);
        Refrigerados r2 = new Refrigerados(7, "11/06/2021", "11/12/2024", "Brasil", 121, -15);
        Refrigerados r3 = new Refrigerados(18, "13/07/2022", "01/05/2024", "China", 10, -10);
        C_Agua a1 = new C_Agua(23, "23/08/2022", "30/03/2024", "Noruega", 10, 0.5);
        C_Agua a2 = new C_Agua(26, "12/08/2022", "27/05/2024", "Suecia", 12, 1);
        C_Aire ai1 = new C_Aire(1, "11/01/2021", "01/03/2024", "Canadá", 0, 20, 30, 25, 25);
        C_Aire ai2 = new C_Aire(111, "19/03/2022", "05/05/2024", "Alemania", -5, 5, 15, 50, 30);
        C_Nitrogeno n1 = new C_Nitrogeno(11, "13/9/2023", "19/12/2025", "Países Bajos", -20, "Nitrógenesis", 12);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(ai1.toString());
        System.out.println(ai2.toString());
        System.out.println(n1.toString());
    }
}

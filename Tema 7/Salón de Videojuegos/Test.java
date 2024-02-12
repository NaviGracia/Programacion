public class Test {
 public static void main(String[] args) {
   JuegoEnAlquiler ja1 = new JuegoEnAlquiler("Mario Bros", "Nintendo", 1986, 5, 10, 0);
   JuegoEnVenta jv1 = new JuegoEnVenta("Mario Bros", "Nintendo", 1986, 5, 10);
   JuegoEnVenta jv2 = new JuegoEnVenta("Mario Bros", "Nintendo", 1985, 35, 10);
   JuegoEnAlquiler ja2 = new JuegoEnAlquiler(ja1);

   System.out.println(jv2.getTotalJuegos());

   System.out.println(ja1.alquilar());

   System.out.println(ja1.devolver());

   System.out.println(ja1.equals(jv1));

   System.out.println(ja1.equals(jv2));

   jv1.compareTo(jv2);
   ja1.compareTo(jv1);
 }
}

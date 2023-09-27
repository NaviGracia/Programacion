package supuesto1;

public class EjercicioTema4 {

    public static void main(String[] args) {
        final int CONS1 = 1008;
        final String CONS2 = " Saludos";
        Integer variable1 = CONS1;
        Integer variable2 = variable1;
        System.out.println("Y las variables son " + variable2 + CONS2);
        /*Actividad Ampliación 2 */
        int b = 9<<2;
        System.out.println(b);
        /* 9<<2 hace que el 9 se mueva dos posiciones a la izquierda en bits,
         es decir, 900 bits, que en decimal seria 9*4 = 36 
         */
        /*Actividad Ampliación 3 */
        int b2 = 16&8;
        System.out.println(b2);
        /* 9<<2 hace que el 9 se mueva dos posiciones a la izquierda en bits,
         es decir, 900 bits, que en decimal seria 9*4 = 36 
         */
    }
}
    
public class Ejercicio12 {
        public static void main (String[] args) {
        Forma f = new Circulo( );
        f.getIdentificador( );
        Circulo c = new Circulo( );
        ((Forma) c).getIdentificador ( );
        ((Circulo) f).getIdentificador ( );
        f.getIdentificador( );
        }
}

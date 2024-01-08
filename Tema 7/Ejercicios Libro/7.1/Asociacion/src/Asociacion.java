public class Asociacion {
    public static void main(String[] args) {
        Equipo e = new Equipo("Valencia CF");
        Jugador j = new Jugador("Sergi Canós");
        System.out.println(j.getNombreJugador() + " es jugador/a del " + e.getNombreEquipo());
    }
}

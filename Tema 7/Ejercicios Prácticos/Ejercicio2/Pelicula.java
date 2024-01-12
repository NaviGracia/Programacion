package Ejercicio2;

public class Pelicula extends Multimedia{
    String actorPrincipal =null;
    String actrizPrincipal=null;

    

    public Pelicula(String titulo, String autor, String formato, String duracion, String actorPrincipal,
            String actrizPrincipal) {
        super(titulo, autor, formato, duracion);
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    @Override
    public String toString() {
        if (actorPrincipal==null&&actrizPrincipal==null) {
            return "Debe haber un actor o actriz.";
        }else if(actorPrincipal==null){
            return "Titulo: " + titulo + "\n Autor: " + autor + "\n Formato: " + formato + "\n Duración: " + duracion + "\n Actor Principal: " + actorPrincipal;
        }else if (actrizPrincipal==null) {
            return "Titulo: " + titulo + "\n Autor: " + autor + "\n Formato: " + formato + "\n Duración: " + duracion + "\n Actriz Principal: " + actrizPrincipal;
        }else{
            return "Titulo: " + titulo + "\n Autor: " + autor + "\n Formato: " + formato + "\n Duración: " + duracion + "\n Actor Principal: " + actorPrincipal + "\n Actriz Principal: " + actrizPrincipal;
        }
        
    }
}

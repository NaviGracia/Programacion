package Ejercicio1;

public class Examen {
    String asignatura;
    int aula;
    String fecha;
    String hora;

    Examen(String asignatura, int aula, String fecha, String hora){
        this.asignatura=asignatura;
        this.aula=aula;
        this.fecha=fecha;
        this.hora=hora;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Examen: " + "\n Asignatura: " + asignatura + "\n Aula: " + aula + "\n Fecha: " + fecha + "\n Hora: " + hora;
    }
    
}

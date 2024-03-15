package SupuestosPracticos.Ejercicio2;

public class ExcepcionDivisionCero extends Exception{
    public ExcepcionDivisionCero (String mensaje){
        super(mensaje);
    }

    public ExcepcionDivisionCero (){
        super("Division entre 0 no válida");
    }
}

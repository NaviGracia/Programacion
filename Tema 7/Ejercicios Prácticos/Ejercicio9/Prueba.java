package Ejercicio9;

public class Prueba {
    protected String nombre;
    protected int ID;
    public String getIdent(){return nombre;};
    public int getIdent(){return ID;};
    /*El código no compilará por la repetición del método getIdent. */
}

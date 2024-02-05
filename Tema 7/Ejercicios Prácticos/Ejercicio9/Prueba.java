package Ejercicio9;

public class Prueba {
    protected String nombre;
    protected int ID;
<<<<<<< HEAD
    public String getIdent ( ) { return nombre;}
    public int getIdent ( ) { return ID;}
    //No porque no puede haber varios métodos con el mismo nombre en una misma clase
=======
    public String getIdent(){return nombre;};
    public int getIdent(){return ID;};
    /*El código no compilará por la repetición del método getIdent. */
>>>>>>> bb775caf22dc82b4977673fad22080f5fb5ae4a5
}

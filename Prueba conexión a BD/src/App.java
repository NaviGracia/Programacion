import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        //Conexión a la Base de Datos
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/basededatos", "dam", "dam");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error de Conexión a la BD");
        }
        /* 
        Desconectar de la Base de Datos
        
        try {
            conexion.close();
        } catch (Exception e) {
            // TODO: handle exception
        } */



        /*
        Insertar Datos
        
        String sentenciaSQL = "INSERT INTO" productos (nombre, );
        PreparedStatement sentencia = null;

        try {
            sentencia = conexion.prepareStatement(sentenciaSQL);
            sentencia.setString(1, nombreProducto);
            sentencia.setString(2, precioProducto);
        } catch (Exception e) {
            // TODO: handle exception
        } */
    }
}



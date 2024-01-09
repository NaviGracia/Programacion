public interface Imprimible {
    public default void encender(){
        formatear("encendiendo el dispositivo");
    }
    public default void apagar(){
        formatear("apagando el dispositivo");
    }
    public default void formatear(String mensaje){
        System.out.println("*********");
        System.out.println(mensaje);
        System.out.println("*********");
    }
}
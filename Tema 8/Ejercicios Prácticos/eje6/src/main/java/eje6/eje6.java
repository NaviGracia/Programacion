package eje6;

public class eje6 {
    public static void main(String[] args) {
        String cad1 = "Pepe";
        String cad2 = new String("Lionel");
        String cad3 = new String(cad2);
        /*Contenido y Longitud */
        System.out.println("Contenido y longitud: ");
        System.out.println("cad1: " + cad1 + " " + cad1.length());
        System.out.println("cad2: " + cad2 + " " + cad2.length());
        System.out.println("cad3: " + cad3 + " " + cad3.length());
        /*Concatenando cad1 y cad2 */
        cad1 = cad1.concat(cad2);
        System.out.println("Concatenación de cad1 y cad2: " + cad1);
        /*toString de cad1 */
        System.out.println("toString de cad1: " + cad1.toString());
        /*Comparando Strings con compareTo*/
        System.out.println("Comparando Strings con compareTo:");
        System.out.println("cad2 con cad3: " + cad2.compareTo(cad3));
        System.out.println("cad1 con cad3: " + cad1.compareTo(cad3));
        System.out.println("cad2 con cad1: " + cad2.compareTo(cad1));
        /*Comparando Strings con equals*/
        System.out.println("Comparando con equals:");
        if (cad2.equals(cad3)) {
            System.out.println("cad2 y cad3 son iguales.");
        }else{
            System.out.println("cad2 y cad3 son diferentes.");
        }
        if (cad1.equals(cad3)) {
            System.out.println("cad1 y cad3 son iguales.");
        }else{
            System.out.println("cad1 y cad3 son diferentes.");
        }
        /*Conviertiendo entre minúsculas y mayúsculas */
        System.out.println("Contenido con cad2 en minúsculas y cad3 en mayúsculas: ");
        System.out.println(cad1);
        System.out.println(cad2.toLowerCase());
        System.out.println(cad3.toUpperCase());
        /*String minombre quitando espacios al principio y final con trim */
        System.out.println("Imprimiendo miNombre sin espacios antes ni después: ");
        String miNombre = " Ivan ";
        System.out.println(miNombre.trim());
        /*replace y substring en cad1 */
        System.out.println("Remplazando las e de Pepe por a");
        cad1 = cad1.replace(cad1.substring(0, 4), "Papa");
        System.out.println(cad1);
        /*startsWith y endsWith */
        System.out.println("Probando startsWith y endsWith: ");
        System.out.println(cad1.startsWith(cad1));
        System.out.println(cad1.endsWith(cad2));
        /*charAt con cad1 */
        System.out.println("Usando charAt para que solo muestre la L de PepeLionel:");
        System.out.println(cad1.charAt(4));
        /*Mostrar posiciones que se ocupan */
        System.out.println("Posición de la primera e: " + cad1.indexOf("e"));
        System.out.println("Posición de la primera a: " + cad1.indexOf("a"));
        System.out.println("Posición de la última a: " + cad1.lastIndexOf("a"));
        /* Creando vector de cad1 */
        cad1 = "Papa-Lionel";
        String[] vector = cad1.split("-");
        System.out.println("PapaLionel separado: " + vector[0] + " " + vector[1]);
        
    }
}
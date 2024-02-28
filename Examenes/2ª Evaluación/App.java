import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    static ArrayList<Figuras> figuras = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void agregarFiguras(){
        System.out.println("Qué figura geométrica desea crear?:");
        System.out.println("1. Triangulo | 2. Rectangulo | 3. Trapecio | 4. Hexagono" + "\n (Por favor inserte el nº de la figura)");
        int figura = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca la base(lado):");
        double baseLado = sc.nextDouble();
        System.out.println("Introduzca la altura:");
        double altura = sc.nextDouble();
        String tipo;
        switch (figura) {
            case 1:
                tipo = "Triangulo";
                figuras.add(new Triangulo(tipo, baseLado, altura));
                break;
            case 2:
                tipo = "Rectangulo";
                figuras.add(new Rectangulo(tipo, baseLado, altura));
                break;
            case 3:
                System.out.println("Introduzca la Base (Debe ser más grande que la base(lado)):");
                double Base = sc.nextDouble();
                tipo = "Trapecio";
                figuras.add(new Trapecio(tipo, baseLado, altura, Base));
                break;
            case 4:
                tipo = "Hexagono";
                figuras.add(new Hexagono(tipo, baseLado, altura));
                break;
        }
        System.out.println("Figura Creada");
    }

    public static void main(String[] args) {
        //int figura;
        int opcion = 0;
        System.out.println("Bienvenido al programa de gestión de figuras geométricas");
        do {
            System.out.println("1. Agregar una figura");
            System.out.println("2. Consultar el nº de figuras creadas");
            System.out.println("3. Mostrar todas las figuras");
            System.out.println("4. Mostrar figura por posición elegida");
            System.out.println("5. Modificar figura");
            System.out.println("6. Eliminar figura");
            System.out.println("7. Vaciar figuras");
            System.out.println("8. Salir");
            System.out.println("Seleccione el nº de la opción que deseas realizar");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    agregarFiguras();
                    break;
                case 2:
                    System.out.println("Figuras Creadas: " + figuras.size());
                    break;
                case 3:
                    for (int i = 0; i < figuras.size(); i++) {
                        System.out.println(figuras.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("Ingrese la posición de la figura a mostrar: ");
                    int pos = sc.nextInt();
                    System.out.println(figuras.get(pos).toString());
                    break;
                case 5:
                    System.out.println("Ingrese la posición de la figura a mostrar: ");
                    int posModif = sc.nextInt();
                    System.out.println("Seleccione modificación ");
                    System.out.println("1. Base(lado)");
                    System.out.println("2. Altura");
                    if (figuras.get(posModif).getTipo().equals("Trapecio")) {
                        System.out.println("3. Base(lado)");   
                    } else{
                        System.out.println("3. No disponible");
                    }
                        System.out.println("4. Salir");
                    int opcModif = sc.nextInt();
                    switch (opcModif) {
                        case 1:
                            System.out.println("Inserte la nueva Base(lado):");
                            double sustBaseLado = sc.nextDouble();
                            figuras.get(posModif).setBase(sustBaseLado);
                            break;
                        case 2:
                            System.out.println("Inserte la nueva altura:");
                            double sustAltura = sc.nextDouble();
                            figuras.get(posModif).setAltura(sustAltura);
                            break;
                        case 3:
                            if (figuras.get(posModif).getTipo().equals("Trapecio")) {
                                System.out.println("Inserte la nueva Base:");
                                double sustBase = sc.nextDouble();
                                //figuras.get(posModif).setBase2(sustBase);
                            }
                            break; 
                        default:
                            break;
                    }
                    break;
                case 6:
                    System.out.println("Indique la posición de la figura que desea eliminar:");
                    int posEliminar = sc.nextInt();
                    System.out.println("Figura eliminada: " + figuras.get(posEliminar).getTipo());
                    figuras.remove(posEliminar);
                    break;
                case 7:
                    System.out.println("Está seguro que desea borrar todas las figuras?");
                    System.out.println("Si | No");
                    String confirmacion = sc.nextLine();
                    if (confirmacion.equalsIgnoreCase("Si")) {
                        figuras.removeAll(figuras);
                        System.out.println("Borrado completado");
                    }else{
                        System.out.println("Operación cancelada");
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 8);
        System.out.println("Programa finalizado");
    }
}
/*
 *  Iterator<Figuras> iterador = figuras.iterator();
                    while (iterador.hasNext()) {
                        if (iterador.next().equals(args)) {
                            
                        }
                    }
                        System.out.println(figuras.get(i).toString());
                    
 */
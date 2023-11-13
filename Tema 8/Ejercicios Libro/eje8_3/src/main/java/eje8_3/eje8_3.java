package eje8_3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class eje8_3 {
    public static String[] añadirAlumno(String[]listaAlumnos, String nuevoAlumno, int posicion){
        String[] nuevaListaAlumnos = new String [listaAlumnos.length+1];
        System.arraycopy(listaAlumnos, 0, nuevaListaAlumnos, 0, posicion);
        nuevaListaAlumnos[posicion] = nuevoAlumno;
        System.arraycopy(listaAlumnos, posicion, nuevaListaAlumnos, posicion+1, listaAlumnos.length-posicion);
        return nuevaListaAlumnos;
    }

    public static String[] eliminarAlumno(String[]listaAlumnos, int posicion){
        String[] nuevaListaAlumnos = new String [listaAlumnos.length-1];
        System.arraycopy(listaAlumnos, 0, nuevaListaAlumnos, 0, posicion);
        System.arraycopy(listaAlumnos, posicion+1, nuevaListaAlumnos, posicion, nuevaListaAlumnos.length-posicion);
        return nuevaListaAlumnos;
    }

    public static String[] ordenarAlumnos(String[] listaAlumnos){
        java.util.Arrays.sort(listaAlumnos);
        return listaAlumnos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nº de alumnos: ");
        int nAlumnos = sc.nextInt();
        sc.nextLine();
        int posicion = 0;
        String [] listaAlumnos;
        listaAlumnos = new String [nAlumnos];
        for(int cont = 0; cont < nAlumnos; cont++){
            System.out.println("Ingrese el nombre del alumno Nº" + cont + ": ");
            listaAlumnos[cont] = sc.nextLine();
        }
        String confirmacionModificacion = "";
        do{
            System.out.println("Quiere modificar los datos introducidos?");
            confirmacionModificacion = sc.nextLine();
            if (confirmacionModificacion.equals("no")) {
                System.out.println("Programa Finalizado");
            } else{
                System.out.println("Opciones de modificación:");
                System.out.println("1: Eliminar alumno.");
                System.out.println("2: Añadir nuevo alumno.");
                System.out.println("3: Ordenar lista del alumnado.");
                System.out.println("Introduzca la opción deseada:");
                int modificación = sc.nextInt();
                switch (modificación) {
                    case 1:
                        System.out.println("Introduzca el nombre del nuevo alumno:");
                        sc.nextLine();
                        String alumnoEliminar = sc.nextLine();
                        String[] pruebaEliminar;
                        for(posicion=0; posicion<listaAlumnos.length; posicion++){
                            if (alumnoEliminar.equals(listaAlumnos[posicion])) {
                                pruebaEliminar = listaAlumnos = eliminarAlumno(listaAlumnos, posicion);
                                System.out.println("Lista de Alumnado Actualizado:");
                                for(int cont = 0; cont < pruebaEliminar.length; cont++){
                                    System.out.println(pruebaEliminar[cont]);
                                }
                            }
                        }
                        break;            
                    case 2:
                        System.out.println("Introduzca el nombre del alumno que desea añadir:");
                        sc.nextLine();
                        String nuevoAlumno = sc.nextLine();
                        System.out.println("En que posición desea insertar el nombre?");
                        posicion = sc.nextInt();
                        String[] pruebaAñadir;
                        pruebaAñadir = listaAlumnos = añadirAlumno(listaAlumnos, nuevoAlumno, posicion);
                        System.out.println("Lista de Alumnado Actualizado:");
                        for(int cont = 0; cont < pruebaAñadir.length; cont++){
                            System.out.println(pruebaAñadir[cont]);
                        }
                        break;
                    case 3:
                        String[] pruebaOrdenar;
                        pruebaOrdenar = listaAlumnos = ordenarAlumnos(listaAlumnos);
                        System.out.println("Lista de Alumnado Actualizado:");
                        for(int cont = 0; cont < pruebaOrdenar.length; cont++){
                            System.out.println(pruebaOrdenar[cont]);
                        }
                        break;   
                }
            }
        }while(confirmacionModificacion.equals("no"));
    }
}
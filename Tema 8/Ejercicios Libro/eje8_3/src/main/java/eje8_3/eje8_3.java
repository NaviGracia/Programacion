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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Nº de alumnos: ");
        int nAlumnos = sc.nextInt();
        sc.nextLine();
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

                        break;            
                    case 2:
                        System.out.println("Introduzca el nombre del nuevo alumno:");
                        sc.nextLine();
                        String nuevoAlumno = sc.nextLine();
                        System.out.println("En que posición desea insertar el nombre?");
                        int posicion = sc.nextInt();
                        String[] prueba;
                        prueba = listaAlumnos = añadirAlumno(listaAlumnos, nuevoAlumno, posicion);
                        System.out.println("Lista de Alumnado Actualizado:");
                        for(int cont = 0; cont < prueba.length; cont++){
                            System.out.println(prueba[cont]);
                        }
                        break;
                    case 3:
                        
                }
        }
        }while(confirmacionModificacion.equals("no"));
    }
}
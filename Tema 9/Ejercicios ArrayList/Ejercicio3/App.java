package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static ArrayList<Alumno> ordenarNombre(ArrayList<Alumno> alumnos){
        Collections.sort(alumnos, new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1, Alumno a2){
                return a1.getNombre().compareTo(a2.getNombre());
            }
        });
        return alumnos;
    }

    public static ArrayList<Alumno> ordenarNota(ArrayList<Alumno> alumnos){
        Collections.sort(alumnos, new Comparator<Alumno>(){
            @Override
            public int compare(Alumno a1, Alumno a2){
                if (a1.getNota() > a2.getNota()) {
                    return 1;
                }if (a1.getNota() < a2.getNota()) {
                    return -1;
                } 
                return 0;
            }
        });
        return alumnos;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        String nombre;
        do{
            System.out.println("Introduzca el Nombre del Usuario (No introduzca nada para acabar el programa):");
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("")) {
                System.out.println("Introduzca la nota del examen de programación: ");
                double nota = sc.nextDouble();
                sc.nextLine();
                alumnos.add(new Alumno(nombre, nota));
            }
        }while(!nombre.equalsIgnoreCase(""));
        ordenarNombre(alumnos);
        System.out.println("Lista Ordenada por Nombre:");
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println(alumnos.get(i).toString());
        }
        ordenarNota(alumnos);
        System.out.println("Lista Ordenada por Nota:");
        for(int i = 0; i < alumnos.size(); i++){
            System.out.println(alumnos.get(i).toString());
        }
    }
}

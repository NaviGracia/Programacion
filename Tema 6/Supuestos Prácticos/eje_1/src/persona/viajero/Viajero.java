package persona.viajero;

import java.util.Scanner;

public class Viajero {
    Scanner sc = new Scanner(System.in);
    private String dni = "000000000A";
    private String nombre = "Ivan";
    private String apellidos = "Garcia";
    private String nacionalidad = "español de España";
    private String direccion = "micasamipuerta 73";
    static int instanciasCreadas = 0;
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    Viajero(String dni, String nombre, String apellidos, String nacionalidad, String direccion){
        instanciasCreadas++;
    }

    Viajero(){
        dni = "000000000A";
        nombre = "Ivan";
        apellidos = "Garcia";
        nacionalidad = "español de España";
        direccion = "micasamipuerta 73";
        instanciasCreadas++;
    }

    void getInfo(){
        System.out.println("1 para mostrar la información de manera pausada o 0 para mostrarla normal.");
        int formato = sc.nextInt();
        if (formato == 0) {
            System.out.println(dni + "; " + nombre + " " + apellidos + "; " + nacionalidad + "; " + direccion);
        } if (formato == 1) {
            System.out.println("DNI: " + dni);
            sc.nextLine();
            sc.nextLine();
            System.out.println("Nombre: " + nombre);
            sc.nextLine();
            System.out.println("Apellidos: " + apellidos);
            sc.nextLine();
            System.out.println("Nacionalidad: " + nacionalidad);
            sc.nextLine();
            System.out.println("Dirección: " + direccion);
            sc.nextLine();
        }else{
            System.out.println("Nº Incorrecto");
        }
        System.out.println(instanciasCreadas);
    }
/*Comprobaciones a través del main */
    public static void main(String[] args) {
        Viajero v1 = new Viajero();
        v1.getInfo();
    }
}

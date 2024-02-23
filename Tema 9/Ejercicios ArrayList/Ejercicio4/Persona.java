package Ejercicio4;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private double peso;
    private char sexo = 'N';
    
    public Persona(String dni, String nombre, String apellido1, String apellido2, int edad, double peso, char sexo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.peso = peso;
        this.sexo = sexo;
    }
    
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
    public String getApellido1() {
        return apellido1;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "DNI: " + dni + "\n Nombre: " + nombre + "\n Apellidos: " + apellido1 + " " + apellido2 + "\n Edad: " + edad + "\n Peso: " + peso + "\n Sexo: " + sexo;
    }
}

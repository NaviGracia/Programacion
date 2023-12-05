package Persona;

public class Persona {

    /*Atributo de objeto constante */
    private final char sexoVariableConstante = 'H'; 
    private char sexo=sexoVariableConstante;
    //private char sexo;
    /*Atributos de objeto */
    private String nombre = "";
    private int edad = 0;
    private double peso = 0;
    private double altura = 0;

    /*Atributo de clase */
    private int instanciasCreadas = 0;

    /* Constructores */
    Persona() { 
        instanciasCreadas++;
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        instanciasCreadas++;
    }

    Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        instanciasCreadas++;
    }

    /*Getters y Setters de atributos de objeto */
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* get del atributo de clase */
    public int getInstanciasCreadas() {
        return instanciasCreadas;
    }

    
}

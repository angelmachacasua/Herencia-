package Herencia;

public class Persona {

    private String Nombre;
    private String Apellido;
    private int Edad;

    public Persona(String nombre, String apellido, int edad) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public int getEdad() {
        return Edad;
    }

}

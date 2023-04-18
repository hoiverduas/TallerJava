import java.util.Scanner;

public class Persona {

    private String nombre;

    private int edad;
    private Double estatura;
    private Double peso;

    private  Double imc;


    public Persona(Double estatura, Double peso, Double imc) {
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
    }

    public Persona(String nombre, int edad, Double estatura, Double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;

    }



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

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }










}

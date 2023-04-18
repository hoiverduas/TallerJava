

public class DatosPersonales {


        private String nombre;

        private String apellidos;


        private int edad;

        private Double estatura;


    public DatosPersonales(String nombre, String apellidos, int edad, Double estatura) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public Double getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}

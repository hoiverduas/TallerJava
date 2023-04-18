public class Mascota {

    private String nombreCompleto ;

    private String nombreMascota ;

    private String tipo ;

    private int edad ;


    public Mascota(String nombreCompleto, String nombreMascota, String tipo, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.nombreMascota = nombreMascota;
        this.tipo = tipo;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public String getTipo() {
        return tipo;
    }

    public int getEdad() {
        return edad;
    }
}

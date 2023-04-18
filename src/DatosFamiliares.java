public class DatosFamiliares {

    private String nombre;

    private String apellidos;

    private String nombreMadre;

    private String apellidosMadre;

    private String nombrePadre;

    private String apellidosPadre;

    public DatosFamiliares(String nombre, String apellidos, String nombreMadre, String apellidosMadre, String nombrePadre, String apellidosPadre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nombreMadre = nombreMadre;
        this.apellidosMadre = apellidosMadre;
        this.nombrePadre = nombrePadre;
        this.apellidosPadre = apellidosPadre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombreMadre() {
        return nombreMadre;
    }

    public String getApellidosMadre() {
        return apellidosMadre;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public String getApellidosPadre() {
        return apellidosPadre;
    }
}

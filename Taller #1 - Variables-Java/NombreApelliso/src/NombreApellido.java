public class NombreApellido {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public  NombreApellido(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;

    }
    public String imprimirNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}








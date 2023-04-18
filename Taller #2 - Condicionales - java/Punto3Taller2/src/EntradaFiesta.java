public class EntradaFiesta {

    private  String nombreCompleto;
    private int edad;

    public EntradaFiesta(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public  void bienvenidoFiesta(){

        if (this.edad >= 18){
            System.out.println(nombreCompleto + " usted es mayor de edad, por lo tanto puede entrar a la fiesta " );
        }
        else {
            System.out.println(nombreCompleto + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa " );
        }
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

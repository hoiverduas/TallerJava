import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        NombreApellido NombreApellido = new NombreApellido(nombre, apellidoPaterno, apellidoMaterno);

        System.out.println("Hola, " + NombreApellido.imprimirNombreCompleto() + "!");



        
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




            Scanner sc = new Scanner(System.in);


            System.out.print("Ingrese su nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese sus apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese su estatura (en metros): ");
            double estatura = sc.nextDouble();

            DatosPersonales DatosPersonales = new DatosPersonales(nombre, apellidos, edad, estatura);

            System.out.println("Su nombre completo es: " + DatosPersonales.getNombre() + " " + DatosPersonales.getNombre());
            System.out.println("Su edad es: " + DatosPersonales.getEdad() + " años");
            System.out.println("Su estatura es: " + DatosPersonales.getEstatura() + " metros");
        }



    }

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        String apellidos = sc.nextLine();

        System.out.print("Ingrese nombre su padre: ");
        String nombrePadre = sc.nextLine();

        System.out.print("Ingrese apellidos de su padre: ");
        String apellidosPadre = sc.nextLine();

        System.out.print("Ingrese nombre su Madre: ");
        String nombreMadre = sc.nextLine();

        System.out.print("Ingrese apellidos de su Madre: ");
        String apellidosMadre = sc.nextLine();

        DatosFamiliares DatosFamiliares = new DatosFamiliares(nombre,apellidos,nombreMadre,apellidosMadre,nombrePadre,apellidosPadre);

        System.out.println("Yo  " + DatosFamiliares.getNombre() + " " + DatosFamiliares.getNombre() + ", soy hijo de "+ DatosFamiliares.getNombreMadre() + " " + DatosFamiliares.getApellidosMadre() + " y " + DatosFamiliares.getNombrePadre() + " " + DatosFamiliares.getApellidosPadre());

    }



}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre completo :");
        String nombreCompleto = sc.nextLine();
        System.out.println("Ingrese su edad :");
        int edad = sc.nextInt();
        EntradaFiesta EntradaFiesta = new EntradaFiesta(nombreCompleto,edad);

        EntradaFiesta.setEdad(edad);
        EntradaFiesta.setNombreCompleto(nombreCompleto);
        EntradaFiesta.bienvenidoFiesta();



    }
}
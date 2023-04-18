import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = sc.nextLine();

        System.out.print("Ingrese nombre de su mascota: ");
        String nombreMascota = sc.nextLine();

        System.out.print("Tipo de Mascota: ");
        String tipo = sc.nextLine();

        System.out.print("Ingrese la edad su mascota : ");
        int edad = sc.nextInt();



        Mascota Mascota = new Mascota(nombreCompleto, nombreMascota, tipo,edad);

        System.out.println(Mascota.getNombreMascota() + "es un(a)" + Mascota.getTipo()+ ", el cual, tiene "+ Mascota.getEdad() + "años de edad y " + Mascota.getNombreCompleto()+"es actualmente su dueño(a)." );



    }
}
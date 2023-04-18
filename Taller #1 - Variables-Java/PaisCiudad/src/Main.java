import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese el nombre de su ciudad: ");
        String ciudad = sc.nextLine();

        System.out.print("Ingrese nombre de su pais: ");
        String pais = sc.nextLine();



        PaisCiudad PaisCiudad = new PaisCiudad(ciudad,pais);

        System.out.println("La ciudad " + PaisCiudad.getCiudad() + ", es la capital del país " + PaisCiudad.getPais() );




    }
}
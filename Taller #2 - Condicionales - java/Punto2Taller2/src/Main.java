import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MenorEdad MayorEdad = new MenorEdad();
        System.out.println("Ingrese su edad :");
        int edad = sc.nextInt();

        MayorEdad.setEdad(edad);
        MayorEdad.esMenor();



    }
}
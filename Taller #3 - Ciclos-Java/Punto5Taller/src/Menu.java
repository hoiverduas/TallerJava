import java.util.Scanner;

public class Menu {
    public void initMenu () {
        boolean exits = false;

        while (!exits) {

            Scanner sn = new Scanner(System.in);

                    System.out.println("////////////////////////////////////");
                    System.out.println("////////- Menu de Usuario - //////////");
                    System.out.println("////////////////////////////////////");
                    System.out.println("   Option #1: Capturar nombre");
                    System.out.println("   Option #2: Saludar Persona");
                    System.out.println("   Option #4: Salir del menu");
                    System.out.println("////////////////////////////////////");


                    System.out.print("Ingrese una opcion : ");
                    int option = sn.nextInt();

                    switch (option) {
                        case 1:
                            caturarNombre();
                            break;
                        case 2:
                            saludoPersonal();
                            break;
                        case 3:
                            exits = true;
                            break;
                        default:
                            System.out.println("No escogiste ninguna opción de (1-3).");
                            break;

                    }







        }
    }
    private void caturarNombre(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scanner.nextLine();

        System.out.println("Bienbenido a Sofka  " + nombre);

    }
    private void saludoPersonal(){


        System.out.println("Hola Sofka Gracias por la Grandiosa Oportudidad  ");

    }

}

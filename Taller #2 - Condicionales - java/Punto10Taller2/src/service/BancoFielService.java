package service;

import entity.User;
import repository.IuserRepository;
import repository.UserRepository;

import java.util.Scanner;



public class BancoFielService {


   private final IuserRepository userRepository;

    public BancoFielService(IuserRepository userRepository) {
        this.userRepository = userRepository;
    }

    String usuario;
    public void initBancoFielService () {
        boolean exits = false;

        while (!exits) {


            Scanner sn = new Scanner(System.in);
            System.out.print("ingrese su usuario: ");
            usuario = sn.next();
            System.out.print("ingrese su clave: ");
            String clave = sn.next();


            User user = userRepository.getByRefID(usuario);


            if (user != null) {

                if (user.equals(userRepository.getByRefID(usuario)) && user.getClave().equals(clave)) {

                    System.out.println("Bienvenido Serñor(a) " + user.getNombreUsuario() + " Numero de cuenta " + user.getNumeroCuenta() + " a su Banco Fiel ");

                    System.out.println("////////////////////////////////////");
                    System.out.println("////////- INPUT OPTIONS - //////////");
                    System.out.println("////////////////////////////////////");
                    System.out.println("   Option #1: Para Realizar Ingresos");
                    System.out.println("   Option #2: Para Hacer Retiros");
                    System.out.println("   Option #3: consultar Saldo");
                    System.out.println("   Option #4: Salir del menu");
                    System.out.println("////////////////////////////////////");


                    System.out.print("Entry a option: ");
                    int option = sn.nextInt();

                    switch (option) {
                        case 1:
                            realizarIngresos ();
                            break;
                        case 2:
                            realizarRetiro ();
                            break;
                        case 3:
                            consultarValor();
                            break;
                        case 4:
                            exits = true;
                            break;
                        default:
                            System.out.println("No escogiste ninguna opción de (1-4).");
                            break;

                    }

                } else {
                    System.out.println("Usuario no se encuentra registrado");
                }

            } else {
                System.out.println("Usuario no se encuentra registrado");
            }



        }
    }
    private void realizarIngresos () {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuanto desea ingresar : ");
        int ingreso = scanner.nextInt();
        User user = userRepository.getByRefID(usuario);
        if(ingreso >0) {
            int totalIngreso = user.getSaldo();
            user.setSaldo(totalIngreso + ingreso);
            System.out.println("Usuario : " + user.getNombreUsuario() + " --> " + " Numero de Cuenta : " + user.getNumeroCuenta() + " --> " + "  Saldo Actual : " + user.getSaldo());
        }else {
            System.out.println("Ingresos deben de ser mayor a cero");
        }
    }



    private void realizarRetiro () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuanto desea retirar : ");
        int retiro = scanner.nextInt();
        User user = userRepository.getByRefID(usuario);
        if (user.getSaldo() > retiro) {
            int totalRetirar = user.getSaldo();
            user.setSaldo(totalRetirar - retiro);
            System.out.println("Usuario : " + user.getNombreUsuario() + " --> " + " Numero de Cuenta : " + user.getNumeroCuenta() + " --> " + "  Saldo Actual : " + user.getSaldo());
        }else {

            System.out.println("Retiro no debe superar saldo de la cuenta");
        }
    }
    private void  consultarValor() {

        User user = userRepository.getByRefID(usuario);
        System.out.println("Usuario : " + user.getNombreUsuario() + " --> " + " Numero de Cuenta : " + user.getNumeroCuenta() + " --> " + "  Saldo Actual : " + user.getSaldo());


    }
}

package service;

import entity.*;

import repository.CakeRepository;
import repository.ICakeRepository;
import repository.IRegisterRepository;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CakeShopService {

    private final IRegisterRepository registerRepository;
    private final ICakeRepository cakeRepository;

    public CakeShopService(IRegisterRepository registerRepository, ICakeRepository cakeRepository) {
        this.registerRepository = registerRepository;
        this.cakeRepository = cakeRepository;
    }

    public void initCakeShopService() {
        boolean exits = false;

        while (!exits) {

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println("   Option #1: registrar pedidos");
            System.out.println("   Option #2: tortas disponibles");
            System.out.println("   Option #3: ventas diarias");
            System.out.println("   Option #4: Salir del menu");
            System.out.println("////////////////////////////////////");

            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option) {
                case 1:

                    registerOrder();
                    break;
                case 2:

                    cakeAvailable();
                    break;
                case 3:
                    dailySales();
                    break;
                case 4:
                    exits = true;
                    break;
                default:
                    System.out.println("No escogiste ninguna opción de (1-4).");
                    break;

            }

        }
    }


    private void registerOrder() {

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("ingresar ID para registro: ");
        Integer registerID = scanner1.nextInt();


        System.out.print("ingrese el nombre del operador: ");
        String operador = scanner1.next();

        System.out.print("ingrese nombre de usuario: ");
        String userName = scanner1.next();

        System.out.print("ingresar decoracion de la torta : ");
        String oputtDecor = scanner1.next();


        Operator operator = new Operator(operador);

        User user = new User(userName);
        Decor decor = new Decor(oputtDecor);


        Register register = new Register(registerID, operator, user, decor);
        if (register != null) {
            register.getDecor().setOputtDecor(oputtDecor);
            registerRepository.save(register);
        } else {
            System.out.println("Datos incorrectos");

        }


        System.out.println(register);


    }

    private void cakeAvailable() {

        CakeRepository cakeRepository = new CakeRepository();
        System.out.println("Cake Available");
        System.out.println(cakeRepository.getByRefID("01"));
        System.out.println(cakeRepository.getByRefID("02"));
        System.out.println(cakeRepository.getByRefID("03"));
        System.out.println(cakeRepository.getByRefID("04"));
        System.out.println(cakeRepository.getByRefID("05"));
        System.out.println(cakeRepository.getByRefID("06"));


        Scanner sn = new Scanner(System.in);
        List<Cake> cakes = new java.util.ArrayList<>();

        System.out.print("Entry the registerID: ");
        Integer registerID = sn.nextInt();

        System.out.print("number of cakes: ");
        int sizeTools = sn.nextInt();

        for (int i = 0; i < sizeTools; i++) {
            System.out.print("Entry ref# Coke" + i + ": ");
            String refID = sn.next();
            Cake cake = cakeRepository.getByRefID(refID);
            if (cake != null) {
                cakes.add(cake);
            } else {
                System.out.print("torta no disponible");
            }
        }

        int totalAmount = cakes.stream().mapToInt(Cake::getPrice).sum();
        Sales sales = new Sales(cakes, totalAmount);
        Register register = registerRepository.getByID(registerID);

        if (register != null) {
            register.setSales(sales);
            System.out.println(register);
        } else {
            System.out.println("Usuario no esta registrado ");
        }

    }


    private void dailySales() {

        Scanner sn = new Scanner(System.in);
        List<Cake> cakes = new java.util.ArrayList<>();
        System.out.println("ingrese ID de venta que desea verificar");
        System.out.print("Entry the registerID: ");
        Integer registerID = sn.nextInt();

        Register register = registerRepository.getByID(registerID);
        if (register != null) {
            System.out.println(register);
        } else {
            System.out.println("no se encuentra en la base de datos ");


        }

    }
}






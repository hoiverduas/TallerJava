package service;

import entity.*;
import repositoy.IProductsRepository;
import repositoy.IRegisterRepository;

import java.util.List;
import java.util.Scanner;

public class DrugstoreService {

    private final IRegisterRepository registerRepository;
    private final IProductsRepository productsRepository;

    public DrugstoreService(IRegisterRepository registerRepository, IProductsRepository productsRepository) {
        this.registerRepository = registerRepository;
        this.productsRepository = productsRepository;
    }

    public void initDrugstoreService(){
        boolean exits = false;

        while(!exits){

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println(" Option #1: buy products");
            System.out.println(" Option #2: consult prices by product");
            System.out.println(" Option #3: returns");
            System.out.println(" Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option){
                case 1:
                    buyProducts();
                    break;
                case 2:
                    consultPricesProduct();
                    break;
                case 3:
                    returns();
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

    private void buyProducts(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre completo del usuario : ");
        String userName = scanner.nextLine();
        System.out.print("ingrese nombre de operador : ");
        String operadorUser = scanner.nextLine();
        System.out.print("ingresar Id del usuario: ");
        Integer registerID = scanner.nextInt();

        User user = new User(userName);
        Operator operator = new Operator(operadorUser);
        Register register = new Register(registerID, user, operator);
        registerRepository.save(register);
        System.out.println(register);

    }

    private void consultPricesProduct() {

        System.out.println("  Peliculas Disponibles  ");
        System.out.println(productsRepository.getByRefID("01"));
        System.out.println(productsRepository.getByRefID("02"));
        System.out.println(productsRepository.getByRefID("03"));
        System.out.println(productsRepository.getByRefID("04"));
        System.out.println(productsRepository.getByRefID("05"));
        System.out.println("");


        Scanner scanner = new Scanner(System.in);
        List<Products> productss = new java.util.ArrayList<>();
        System.out.print("ingresar Id del usuario: ");
        Integer registerID = scanner.nextInt();
        System.out.print("cuantos productos desea comprar : ");
        int sizeTools = scanner.nextInt();
        for (int i = 0; i < sizeTools; i++) {
            System.out.print("Entry ref# "+(i+1)+ " product :");
            String refID = scanner.next();
            Products products = productsRepository.getByRefID(refID);
            if (products != null) {
                productss.add(products);
            } else {
                System.out.print("producto no se encuentra disponible");
            }
        }
        int totalPreice = productss.stream().mapToInt(Products::getPrice).sum();
        ProductSale productSale = new ProductSale( productss,totalPreice);
        Register register = registerRepository.getByID(registerID);

        if (register != null) {
            register.setProductSale(productSale);
            System.out.println(register);
        } else {
            System.out.println("Usuario no esta registrado ");
        }
    }

    private void returns(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresar Id del usuario: ");
        Integer registerID = scanner.nextInt();
        Register register = registerRepository.getByID(registerID);
        if (register != null) {
            registerRepository.remove(register);
            System.out.println("Devolucion exitosa");
            System.out.println(register);
            System.out.println("");
        } else {
            System.out.println("usuario no se encuentra en la base de datos");

        }



    }
}

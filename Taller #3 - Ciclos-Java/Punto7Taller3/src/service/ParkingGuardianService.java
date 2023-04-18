package service;

import entity.*;
import repository.IRegisterRepository;

import java.util.Scanner;

public class ParkingGuardianService {

    private final IRegisterRepository registerRepository;
    private Integer admissionTime;

    public ParkingGuardianService(IRegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public void initParkingGuardianService() {

        boolean exits = false;

        while (!exits) {

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println(" Option #1: Entered the parking lot");
            System.out.println(" Option #2: remove from the parking lot");
            System.out.println(" Option #3: consult vehicle ");
            System.out.println(" Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option) {
                case 1:
                    enteredParkingLot();
                    break;
                case 2:
                    removeParking();
                    break;
                case 3:
                    consultVehicle();
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

    private void enteredParkingLot() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese  registerID para ingreso: ");
        Integer registerID = scanner.nextInt();

        System.out.print("ingrese nombre completo del usuario : ");
        scanner.nextLine();
        String userName = scanner.nextLine();


        Scanner scanner2 = new Scanner(System.in);
        System.out.print("numero de telefono del usuario : ");
        String cellNumber = scanner2.next();

        System.out.print("ingrese nombre del operario: ");
        String operatorName = scanner2.next();

        Scanner scanner1 = new Scanner(System.in);

        System.out.print("ingrese marca del Vehiculo : ");
        String brand = scanner1.next();

        System.out.print("ingrese placa del vehiculo : ");
        String licencePlate = scanner1.next();

        System.out.print("hora de entrada: ");
        Integer entryTime = scanner1.nextInt();

        Operator operator = new Operator(operatorName);
        User user = new User(userName, cellNumber);
        Vehicle vehicle = new Vehicle(brand, licencePlate);
        Register register = new Register(registerID, operator, user, vehicle);
        register.setEntryTime(entryTime);
        registerRepository.save(register);
        System.out.println(register);

    }


    private void removeParking(){

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("ingrese registerID para retiro Vehiculo : ");
        Integer registerID = scanner3.nextInt();
        System.out.print("hora de salida: ");
        int departureTime = scanner3.nextInt();
        Register register = registerRepository.getByID(registerID);
        register.setDepartureTime(departureTime);
        int price = (register.getDepartureTime()-register.getEntryTime())*1000;
        register.setPrice(price);
        registerRepository.remove(register);
        System.out.println("Vehiculo  fue retirado del parqueadero --> :" + register);

    }



    private void consultVehicle(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese registerID para consultar:");
        Integer registerID = scanner.nextInt();
        Register register = registerRepository.getByID(registerID);

        if (register != null) {
            System.out.println(register);
        }else {
            System.out.println("Vehiculo no se encuentra en la base de datos o fue eliminado");
        }
    }
}

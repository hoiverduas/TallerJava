package service;


import entity.*;
import repository.IRegisterRepository;
import repository.IToolRepository;

import java.util.List;
import java.util.Scanner;
public class WorkShopService {

    private final IToolRepository toolRepository;
    private final IRegisterRepository registerRepository;

    public WorkShopService(IToolRepository toolRepository, IRegisterRepository registerRepository){
        this.toolRepository = toolRepository;
        this.registerRepository = registerRepository;
    }

    public void initWorkShop(){
        boolean exits = false;

        while(!exits){

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println("   Option #1: Ingreso al taller");
            System.out.println("   Option #2: Salida taller");
            System.out.println("   Option #3: Consultar inventario");
            System.out.println("   Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option){
                case 1:
                    arriveWorkShop();
                    break;
                case 2:
                    finishRepair();
                    break;
                case 3:
                    merchantOrder();
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
    private void arriveWorkShop(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entry the registerID: ");
        Integer registerID = scanner.nextInt();

        System.out.print("Entry the operatorName: ");
        String operatorName = scanner.next();

        System.out.print("Entry the userName: ");
        String userName = scanner.next();

        System.out.print("Entry the licencePlate: ");
        String licencePlate = scanner.next();

        System.out.print("Entry the input observations: ");
        String inputObservations = scanner.next();

        //*Create register*/
        Operator operator = new Operator(operatorName);
        Moto moto = new Moto(licencePlate);
        User user = new User(userName, moto);
        Observation observation = new Observation(inputObservations);
        Register register = new Register(registerID,operator,user,observation);
        registerRepository.save(register);
    }
    private void finishRepair(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Input the registerID: ");
        Integer registerID = sn.nextInt();

        System.out.print("Entry the output observations: ");
        String outputObservations = sn.next();

        Register register = registerRepository.getByID(registerID);
        if (register != null){
            register.getObservation().SetOutputObservations(outputObservations);
        }

        System.out.println(register);
    }
    private void merchantOrder(){
        Scanner sn = new Scanner(System.in);
        List<Tool> tools = new java.util.ArrayList<>();

        System.out.print("Entry the registerID: ");
        Integer registerID = sn.nextInt();

        System.out.print("Entry size tools: ");
        int sizeTools = sn.nextInt();

        for (int i = 0; i < sizeTools; i++){
            System.out.print("Entry ref#"+i+": ");
            String refID = sn.next();
            Tool tool = toolRepository.getByRefID(refID);
            if (tool != null){
                tools.add(tool);
            }else {
                System.out.print("No fond this tool");
            }
        }

        int totalAmount = tools.stream().mapToInt(Tool::getPrice).sum();
        Inventory inventory = new Inventory(tools, totalAmount);
        Register register = registerRepository.getByID(registerID);
        register.setInventory(inventory);
        System.out.println(register);
    }
}



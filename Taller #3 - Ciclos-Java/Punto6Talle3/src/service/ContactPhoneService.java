package service;

import entity.Contact;
import entity.Register;
import entity.User;
import repository.IRegisterRepository;
import repository.RegisterRepository;

import java.util.Scanner;

public class ContactPhoneService {

    private  final IRegisterRepository registerRepository;

    public ContactPhoneService(IRegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public void initContactPhoneService (){

        boolean exits = false;

         while(!exits){

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println("   Option #1: Register Contact");
            System.out.println("   Option #2: Search Contact");
            System.out.println("   Option #3: delete contact");
            System.out.println("   Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option){
                case 1:
                    registerContact();
                    break;
                case 2:
                    searchContact();
                    break;
                case 3:
                    deleteContact();
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
    private void registerContact(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese nombre :");
        String registerID = scanner.nextLine();


        System.out.print("ingrese apellidos:");
        String nameComplete = scanner.nextLine();

        System.out.print("ingrese numero de telefono:");
        String number = scanner.next();

        Contact contact = new Contact(number);
        User user = new User(nameComplete);
        Register register = new Register(registerID,user,contact);
            registerRepository.save(register);
            System.out.println(register);

    }
    private void searchContact(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre que desea buscar:");
        String registerID = scanner.nextLine();
        Register register = registerRepository.getByID(registerID);

             if (register != null) {
                 System.out.println(register);
             }else {
                 System.out.println("contacto no se encuentra den la base de datos o fue eliminado");
             }
    }
    private void deleteContact(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese nombre de contacto que desea eliminar  :");
        String registerID = scanner.nextLine();
        Register register = registerRepository.getByID(registerID);
        registerRepository.remove(register);
        System.out.println("contacto fue eliminado de la base de datos --> :" + register);


    }
}

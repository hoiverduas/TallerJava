package service;

import entity.Register;
import entity.User;
import repository.IRegisterRepository;

import java.util.Scanner;

public class DrivingSchoolService {

    private final IRegisterRepository registerRepository;

    public DrivingSchoolService(IRegisterRepository registerRepository) {
        this.registerRepository = registerRepository;
    }

    public void initDrivingSchoolService() {

        boolean exits = false;

        while (!exits) {

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println(" Option #1: register user");
            System.out.println(" Option #2: note input");
            System.out.println(" Option #3: course test results ");
            System.out.println(" Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    noteInput();
                    break;
                case 3:
                    courseTestResults();
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



    private void registerUser(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingrese nombre completo del usuario : ");
        String userName = scanner.nextLine();
        System.out.print("ingrese numero de documento: ");
        Integer registerID = scanner.nextInt();

        User user = new User(userName);
        Register register = new Register(user,registerID);
        if (userName!=null || registerID != null) {
            registerRepository.save(register);
            System.out.println(register);
        }else {
            System.out.println("datos mal ingresados");
        }

    }

    private void noteInput(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("ingrese numero de documento de estudiante : ");
        Integer registerID = scanner1.nextInt();
        System.out.print("ingresar si estudiante (aprobo o reprobo) : ");
        String results = scanner1.next();
        Register register = registerRepository.getByID(registerID);
        register.setResults(results);
        if(register != null) {
            registerRepository.save(register);
            register.setResults(results);
            System.out.println(register);
        }else {
            System.out.println("error usuario no se encuentra en la base de datos");
        }
       }
      private void courseTestResults() {

          Scanner scanner2 = new Scanner(System.in);
          System.out.print("ingrese numero de documento de estudiante : ");
          Integer registerID = scanner2.nextInt();
          Register register = registerRepository.getByID(registerID);
          if (register != null) {
              System.out.println(register);
          } else {
              System.out.println("estudiante no ha presentado el curso o no encuentra registrado");
          }

      }
}

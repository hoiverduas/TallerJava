package service;

import entity.*;
import repository.IRepositoryMovie;
import repository.IRepositoryRegister;
import repository.RepositoryMovie;

import java.util.List;
import java.util.Scanner;

public class VideoStoreService {

                private  final IRepositoryRegister repositoryRegister;
                private  final IRepositoryMovie repositoryMovie;

    public VideoStoreService(IRepositoryRegister repositoryRegister, IRepositoryMovie repositoryMovie) {
        this.repositoryRegister = repositoryRegister;
        this.repositoryMovie = repositoryMovie;
    }


    public void initVideoStoreService(){
        boolean exits = false;

        while(!exits){

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println("   Option #1: register user");
            System.out.println("   Option #2: rent movie");
            System.out.println("   Option #3: receive movie");
            System.out.println("   Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option){
                case 1:
                    registerMovie();
                    break;
                case 2:
                    rentMovie();
                    break;
                case 3:
                    receiveMovie();
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
        private void registerMovie(){

            Scanner scanner = new Scanner(System.in);
            System.out.print("ingrese nombre completo del usuario : ");
            String userName = scanner.nextLine();
            System.out.print("ingrese nombre de operador : ");
            String operadorUser = scanner.nextLine();
            System.out.print("ingresar Id del usuario: ");
            Integer registerID = scanner.nextInt();

            Operator operator = new Operator(operadorUser);
            User user = new User(userName);
            Register register = new Register(user,operator,registerID);
            if (register != null) {
                repositoryRegister.save(register);
                System.out.println(register);
            }else {
                System.out.println("error al ingresar datos");
            }
        }
    private void rentMovie(){

        System.out.println("Peliculas Disponibles");
        System.out.println(repositoryMovie.getByRefID("01"));
        System.out.println(repositoryMovie.getByRefID("02"));
        System.out.println(repositoryMovie.getByRefID("03"));


        Scanner scanner = new Scanner(System.in);
        List<Movie> movies = new java.util.ArrayList<>();

        System.out.print("ingresar Id del usuario: ");
        Integer registerID = scanner.nextInt();

        System.out.print("cuantas peliculas desea arquilar : ");
        int sizeTools = scanner.nextInt();

        for (int i = 0; i < sizeTools; i++) {
            System.out.print("Entry ref# "+ (i+1) +" movie :");
            String refID = scanner.next();
            Movie movie = repositoryMovie.getByRefID(refID);
            if (movie != null) {
                movies.add(movie);
            } else {
                System.out.print("Pelicula no se encuentra disponible");
            }

        }
        int totalPreice = movies.stream().mapToInt(Movie::getPrice).sum();
        MovieSale movieSale = new MovieSale(movies, totalPreice);

        Register register = repositoryRegister.getByID(registerID);

        if (register != null) {
            register.setMovieSale(movieSale);
            System.out.println(register);
        } else {
            System.out.println("Usuario no esta registrado ");
        }
    }
    private void receiveMovie(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("ingresar Id del usuario: ");
        Integer registerID = scanner.nextInt();

        System.out.print(" ingresar Observaciones: ");
        String  inputObservations = scanner.next();

        Observations observations = new Observations(inputObservations);

        Register register = repositoryRegister.getByID(registerID);


        if (register != null) {
            register.setObservations(observations);
            System.out.println(register);
        } else {
            System.out.println("Usuario no esta registrado ");
        }

    }

}

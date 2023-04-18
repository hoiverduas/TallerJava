package service;

import entity.Calcular;
import entity.Rectángulo;
import entity.Trapecio;
import entity.Triangulo;

import java.util.Scanner;

public class GeometriaService {


    public void initGeometriaService(){
        boolean exits = false;

        while(!exits){

            System.out.println("////////////////////////////////////");
            System.out.println("////////- INPUT OPTIONS - //////////");
            System.out.println("////////////////////////////////////");
            System.out.println("   Option #1: Para Calcular El Area De Un Triángulo");
            System.out.println("   Option #2: Para Calcular El Area De Un Rectángulo");
            System.out.println("   Option #3: Para Calcular El Area De Un Trapecio");
            System.out.println("   Option #4: Salir menu");
            System.out.println("////////////////////////////////////");


            Scanner sn = new Scanner(System.in);
            System.out.print("Entry a option: ");
            int option = sn.nextInt();

            switch (option){
                case 1:
                   calcularAreaTriangulo();
                    break;
                case 2:
                    calcularAreaRectangulo();
                    break;
                case 3:
                    calcularAreaTrapecio();
                    break;
                case 4:
                    exits = true;
                    break;
                default:

            }

        }
    }

    private void calcularAreaTriangulo(){

        double resultado ;
        double base ;
        double altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la base del triangulo:");
        base = scanner.nextDouble();
        System.out.print("ingrese la altura del triangulo:");
        altura = scanner.nextDouble();
        resultado = (base*altura)/2;

        Triangulo triangulo = new Triangulo(resultado,base,altura);

        Calcular calcular = new Calcular(triangulo);
        System.out.print("Area del triangulo = " + resultado);
        System.out.println("");

    }
    private void calcularAreaRectangulo(){
        double resultado ;
        double ancho ;
        double lado;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese el ancho del rectangulo:");
        ancho = scanner.nextDouble();
        System.out.print("ingrese el lado del rectangulo:");
        lado = scanner.nextDouble();
        resultado = (lado*ancho);

        Rectángulo rectángulo = new Rectángulo(resultado,ancho,lado);

        Calcular calcular = new Calcular(rectángulo);
        System.out.print("Area del rectangulo = " + resultado);
        System.out.println("");

    }
    private void calcularAreaTrapecio(){

        double resultado ;
        double base ;
        double altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese la base trapecio :");
        base = scanner.nextDouble();
        System.out.print("ingrese la altura del trapecio:");
        altura = scanner.nextDouble();
        resultado = (base + altura)*(altura)/2;

        Trapecio trapecio = new Trapecio(resultado,base,altura);

        Calcular calcular = new Calcular(trapecio);

        System.out.print("Area del trapecio = " + resultado);



    }
}

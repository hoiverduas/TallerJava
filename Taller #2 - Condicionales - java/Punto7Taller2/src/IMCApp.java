import java.util.Scanner;

public class IMCApp {

    private CalcularImc calcularImc = new CalcularImc();

    public void initialApp(){
           
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre completo :");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su estatura  en metros:");
        Double estatura = scanner.nextDouble();
        System.out.println("ingrese su peso en Kg :");
        Double peso = scanner.nextDouble();
        System.out.println("ingrese su edad :");
        int edad = scanner.nextInt();
        Persona persona = new Persona(nombre, edad, estatura, peso);



        Double imc = calcularImc.calcularIMC(persona);

        getIMCType(imc);
    }

   private void getIMCType(Double imc) {

        if(imc < 18.5){
            System.out.println("rango de peso insuficiente: " + imc);
        }
        else if (imc >= 18.5 && imc <= 24.9){
            System.out.println("se encuentra dentro del rango de peso normal o saludable: " + imc);
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("se encuentra dentro del rango de sobrepeso " + imc);
        }else {

            System.out.println("superior, se encuentra dentro del rango de obesidad." + imc);
        }

      }
}




import java.util.Random;
import java.util.Scanner;

public class NumeroAleatoriosService {

    public void initNumeroAleatoriosService() {

        int[] numeros = new int[20];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // Llenar el arreglo con números aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        // Imprimir los números pares e impares
        System.out.print("Numeros pares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print("," + numeros[i]);
            }
        }
        System.out.println("");
        System.out.print("Numeros impares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print("," + numeros[i]);
            }
        }
    }
}





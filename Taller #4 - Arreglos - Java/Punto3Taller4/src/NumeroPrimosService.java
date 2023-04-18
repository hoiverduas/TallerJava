import java.util.Random;
import java.util.Scanner;

public class NumeroPrimosService {

    public void initNumeroPrimosService() {

        System.out.println("Numeros Primos del 1 al 1000");

        for (int i = 2; i <= 1000; i++) {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {

                System.out.print("," + i );
            }
        }


    }
}

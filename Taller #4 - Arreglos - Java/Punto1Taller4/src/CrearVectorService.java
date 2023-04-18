import java.util.Scanner;

public class CrearVectorService {

    public void initCrearVectorService() {

        int[] num = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <num.length ; i++) {

            System.out.print("ingresar pocision "+i+":");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < num.length ; i++) {

            System.out.println("["+i+"] = " + num[i]);

        }
    }
}

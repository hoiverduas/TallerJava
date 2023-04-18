import java.util.Scanner;

public class Tablas {

    public void initTablas() {

        tablasMultiplicar();

    }

    private void tablasMultiplicar() {


        int index = 0;

        Scanner sn = new Scanner(System.in);
        System.out.print("ingrese el numero de la tabla que desea crear : ");
        index = sn.nextInt();
           if(index > 0 && index <= 10) {
               for (int i = index; i < index + 1; i++) {

                   for (int j = 1; j < 11; j++) {

                       System.out.println(i + "x" + j + " = " + j * i);


                   }
               }
           }else {
               System.out.println("Solo se permiten tallas de 1 al 10 ");
           }
    }
}
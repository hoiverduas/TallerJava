import java.util.Scanner;

public class TablasMultiplicarService {

   void initTablasMultiplicarService(){

      boolean n = true;
      Scanner scanner = new Scanner(System.in);

      while (n) {
         System.out.println("-------------------------------------------------------------------------------------------------------");
         System.out.println("                                                COLUMNA");
         System.out.println("-------------------------------------------------------------------------------------------------------");
         System.out.println("        0        1          2         3         4         5         6         7         8         9   ");
         System.out.println("-------------------------------------------------------------------------------------------------------");
         tabla("  ",1,10);
         System.out.println("   -    |0");
         tabla("  ",2,10);
         System.out.println("   -    |1");
         tabla("  ",3,10);
         System.out.println("   -    |2       -->  F");
         tabla("  ",4,10);
         System.out.println("   -    |3       -->  I");
         tabla("  ",5,10);
         System.out.println("   -    |4       -->  L");
         tabla("  ",6,10);
         System.out.println("   -    |5       -->  A");
         tabla("  ",7,10);
         System.out.println("   -    |6       -->  S");
         tabla("  ",8,10);
         System.out.println("   -    |7");
         tabla("  ",9,10);
         System.out.println("   -    |8");
         tabla(" ",10,10);
         System.out.println("   -    |9");
         System.out.println("");
         System.out.println("");
         System.out.println("Bienvenido a la APP de Tablas de Multiplicar");
         System.out.println("");
         System.out.print("Ingrese fila:");
         int p = scanner.nextInt();
         System.out.print("Ingrese columna:");
         int q = scanner.nextInt();
         tablaResultado(p,q);

      }
   }



   public static void tabla(String l, int x, int z) {
      int[][] matriz = new int[100][100];

      for (int k = 1; k <= x; k++) {
         for (int j = 1; j <= z; j++) {
            matriz[k][j] = k * j;
         }
      }

      for (int k = x; k <= x; k++) {
         for (int j = 1; j <= z; j++) {
            System.out.print("     " + l + j + "x" + k);
         }
      }
   }

   public static void tablaResultado(int g, int m) {
      int[][] matriz = new int[100][100];
      int k = 1;
      int j = 1;

      for (k = 1; k <= g + 1; k++) {
         for (j = 1; j <= m + 1; j++) {
            matriz[k][j] = (g + 1) * (m + 1);
         }
      }

      for (k = 1; k <= 1; k++) {
         for (j = 1; j <= 1; j++) {
            System.out.println(g + 1 + "x" + (m+ 1) + "=" + matriz[k][j]);
         }
      }

   }

}


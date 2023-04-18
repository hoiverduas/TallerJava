public class MatrizBidimensionalService {

    public void initMatrizBidimensionalService() {


        int[][] matriz = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };
        System.out.println("Matriz Original");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print(String.format("%02d ", matriz[i][j]));

            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz Modificada");
        int[][] nuevaMatriz = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 1 || i == 3) {
                    nuevaMatriz[i][4 - j] = matriz[i][j];
                } else {
                    nuevaMatriz[i][j] = matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(String.format("%02d ", nuevaMatriz[i][j]));
            }
            System.out.println();
        }




    }
}

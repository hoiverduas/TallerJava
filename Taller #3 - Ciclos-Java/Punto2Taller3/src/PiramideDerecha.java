public class PiramideDerecha {

    public void initPiramide() {

        Piramide();
    }
    private void Piramide() {

        int numFilas = 10;
        int i = 0;
        while (i < numFilas) {
            int j = 0;
            while (j < numFilas - i) {
                System.out.print(" ");
                j++;
            }
            int k = 0;
            while (k < i ) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }






    }
}

public class PiramideIquierda {

    public void initPiramide() {

        Piramide();
    }
    private void Piramide() {

        int numFilas = 9;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numFilas; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


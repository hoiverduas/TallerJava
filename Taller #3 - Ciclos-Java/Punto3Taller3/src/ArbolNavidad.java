public class ArbolNavidad {

    public void initArbolNavidad() {

        ArbolNavidad();

    }

    private void ArbolNavidad() {

        int i = 0, j = 0, k = 0;

        while (i < 10) { // Número de filas
            j = 0;
            while (j < (10 - i)) { // Espacios en blanco antes de los asteriscos
                System.out.print(" ");
                j++;
            }

            k = 0;
            do { // Asteriscos
                System.out.print("*");
                k++;
            } while (k < (2 * i + 1)); // Número de asteriscos en cada fila

            System.out.println();
            i++;
        }

        i = 0;

        while (i < 2) { // Número de filas de los troncos
            j = 0;
            while (j < 9) { // Espacios en blanco antes de los troncos
                System.out.print(" ");
                j++;
            }

            k = 0;
            do { // Asteriscos que forman el tronco
                System.out.print("*");
                k++;
            } while (k < 3);

            System.out.println();
            i++;
        }

        i = 0;

        while (i < 1) { // Número de filas de los troncos
            j = 0;
            while (j < 8) { // Espacios en blanco antes de los troncos
                System.out.print(" ");
                j++;
            }


            k = 0;
            do { // Asteriscos que forman el tronco
                System.out.print("*");
                k++;
            } while (k < 5);

            System.out.println();
            i++;
        }
        i = 0;

        while (i < 1) { // Número de filas de los troncos
            j = 0;
            while (j < 7) { // Espacios en blanco antes de los troncos
                System.out.print(" ");
                j++;
            }


            k = 0;
            do { // Asteriscos que forman el tronco
                System.out.print("*");
                k++;
            } while (k < 7);

            System.out.println();
            i++;
        }

    }
}
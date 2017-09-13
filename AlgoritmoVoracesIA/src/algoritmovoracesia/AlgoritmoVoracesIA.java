package algoritmovoracesia;

public class AlgoritmoVoracesIA {

    String MensajeSolucion = "";
    int Soluciones = 0;

    public String Solucion(int montoIngresado, int monedas[]) {

        MensajeSolucion = "";
        
        quicksort(monedas, 0, monedas.length - 1);
        int monedaSeleccionadaPosicion = 0, moneda1000 = 0, moneda500 = 0, moneda200 = 0, moneda100 = 0, moneda50 = 0;

        while (Soluciones != montoIngresado) {

            monedaSeleccionadaPosicion = monedas.length - 1;

            while (monedaSeleccionadaPosicion >= 0) {

                if ((Soluciones + monedas[monedaSeleccionadaPosicion]) <= montoIngresado) {

                    Soluciones = Soluciones + monedas[monedaSeleccionadaPosicion];
                    //MensajeSolucion += "\n Moneda de : " + monedas[monedaSeleccionadaPosicion];

                    switch (monedaSeleccionadaPosicion) {
                        case 0:
                            moneda50++;
                            break;
                        case 1:
                            moneda100++;
                            break;
                        case 2:
                            moneda200++;
                            break;
                        case 3:
                            moneda500++;
                            break;
                        default:
                            moneda1000++;
                            break;
                    }

                } else {

                    monedaSeleccionadaPosicion = monedaSeleccionadaPosicion - 1;

                }

            }

        }

        MensajeSolucion = "La solucion encontrada para " + montoIngresado + " es : \n" +
                "" + moneda1000 + " Monedas de 1000 \n"+
                "" + moneda500 + " Monedas de 500 \n"+
                "" + moneda200 + " Monedas de 200 \n"+
                "" + moneda100 + " Monedas de 100 \n"+
                "" + moneda50 + " Monedas de 50 \n";

        return MensajeSolucion;

    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq; // i realiza la búsqueda de izquierda a derecha
        int j = der; // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {            // mientras no se crucen las búsquedas
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;         // busca elemento menor que pivote
            }
            if (i < j) {                      // si no se han cruzado                      
                aux = A[i];                  // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }
        A[izq] = A[j]; // se coloca el pivote en su lugar de forma que tendremos
        A[j] = pivote; // los menores a su izquierda y los mayores a su derecha
        if (izq < j - 1) {
            quicksort(A, izq, j - 1); // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der); // ordenamos subarray derecho
        }
    }

}

package parcial2estructura;

import javax.swing.JOptionPane;

public class Parcial2Estructura {

    public static void main(String[] args) {

        boolean numeroPar;
        Funciones funciones = new Funciones();
        Mensajes mensajes = new Mensajes();

        String menu = "";
        int contador = 0;

        int opcion;

        do {
            opcion = funciones.menuPrincipal();

            switch (opcion) {

                case 1:
                    int numeroIngresado = mensajes.leerInt("Ingresar un Numero");
                    String numeroCadena = Integer.toString(numeroIngresado);

                    if (contador > 0) {

                        int numeroAleatorio = (int) (Math.random() * 10);
                        numeroPar = funciones.numeroParoImpar(numeroAleatorio);

                        if (numeroPar) {
                            funciones.AddFinal(numeroCadena);
                        } else {
                            funciones.AddInicio(numeroCadena);
                            //funciones.OrdenamientoDatos(numeroCadena);
                        }

                    } else {
                        funciones.AddInicio(numeroCadena);
                        contador++;
                    }

                    break;

                case 2:

                    int numeroAleatorio = (int) (Math.random() * 30 + 20);
                    numeroPar = funciones.numeroParoImpar(numeroAleatorio);

                    if (numeroPar) {
                        funciones.MostarListaDerecha();
                    } else {
                        funciones.MostarListaIzquierda();
                    }

                    break;

                case 0:
                    break;

            }

        } while (opcion != 0);

    }

}

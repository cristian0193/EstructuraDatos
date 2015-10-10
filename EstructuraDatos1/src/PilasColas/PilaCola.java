package PilasColas;

import javax.swing.JOptionPane;

/**
 * Esta clase ejecuta el programa medante un menu
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class PilaCola {

    public Nodo cabeza;

    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Funciones fun = new Funciones();
        PilaCola lista = new PilaCola();
        Mensajes mensajes = new Mensajes();

        int contador = 0;
        int identificacion = 0;
        String nombre = "";
        String datosCliente = "";

        int opcion;

        do {
            opcion = lista.menuPrincipal();
            switch (opcion) {

                case 1:

                    while (contador != 4) {
                        try {
                            mensajes.mostrarInformacion("ESPERE POR FAVOR HACER ATENDIDO .......");
                            Thread.sleep(5000);

                            mensajes.mostrarInformacion("TURNO # " + (contador + 1));
                            
                            identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                            nombre = mensajes.leerString("Ingrese Nombre de Estudiante : ");

                            int numeroEspecial = (int) (Math.random() * 100);
                            int numeroAleatorioCola = (int) (Math.random() * 25);
                            String especial = fun.estadoEspecial(numeroEspecial);

                            fun.adicionarClienteCola(new Clientes(identificacion, nombre, especial),numeroAleatorioCola);
                              

                            contador++;
                            System.out.println("contador : " + contador);
                        } catch (InterruptedException ex) {
                            JOptionPane.showMessageDialog(null, "ERROR " + ex);
                        }
                    }

                    mensajes.mostrarInformacion("EL DIA DE HOY TERMINA LA JORNADA \n" + "MUCHAS GRACIAS POR SU ESPERA");

                    break;

                case 3:
                    mensajes.mostrarInformacion(""+fun.ListarPila());
                    break;

                case 4:
                    mensajes.mostrarInformacion(""+fun.ListarCola());
                    break;
                    
                case 0:
                    System.exit(0);
                    break;
                default:
                    mensajes.mostrarError("¡La opción no existe!");
            }
        } while (opcion != 0);

    }

    public int menuPrincipal() {
        Mensajes entrada = new Mensajes();

        String cadena = "M  E  N  U \n"
                + "1) Inicio Jornada del Dia \n"
                + "2) Proceso de Atencion \n"
                + "3) Mostar Pilas \n"
                + "4) Mostar Colas \n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

    public int menuProcesoReportes() {
        Mensajes entrada = new Mensajes();

        String cadena = "M  E  N  U \n"
                + "1) Total Clientes Atendidos en el Dia (En Caja y otros Servicos) \n"
                + "2) Total de Cliente por Servicio \n"
                + "3) Total de Cliente Especiales\n"
                + "4) Total de Cliente por Servicio y Tipo (Especiales y No especiales)\n"
                + "5) Lista de Ultimos Clientes de Cajas \n"
                + "6) Numero de Clientes Atendidos en cada Caja y Tiempo Total Utilizado\n"
                + "0) Salir. ";

        return entrada.leerInt(cadena);
    }

}

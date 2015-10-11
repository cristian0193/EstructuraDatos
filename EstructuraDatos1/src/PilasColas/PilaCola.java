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
        Colas colas = new Colas();
        Pilas pilas = new Pilas();

        int contador = 0;
        int identificacion = 0;
        String nombre = "";
        String datosCliente = "";

        Nodo cola = null;

        int opcion;

        do {
            opcion = lista.menuPrincipal();
            switch (opcion) {

                case 1:
                    while (contador != 4) {
                        try {
                            mensajes.mostrarInformacion("ESPERE POR FAVOR HACER ATENDIDO ....... \n" + "PRESIONE ACEPTAR");
                            //Thread.sleep(3000);

                            mensajes.mostrarInformacion("TURNO # " + (contador + 1));

                            identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                            nombre = mensajes.leerString("Ingrese Nombre de Cliente: ");

                            int numeroEspecial = (int) (Math.random() * 100);
                            int numeroAleatorioCola = (int) (Math.random() * 25);
                            String especial = fun.estadoEspecial(numeroEspecial);

                            colas.adicionarClienteCola(new Clientes(identificacion, nombre, especial), numeroAleatorioCola, "SI");

                            contador++;

                            System.out.println("contador : " + contador);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "ERROR " + ex);
                        }
                    }

                    mensajes.mostrarInformacion("EL DIA DE HOY TERMINA LA JORNADA \n" + "MUCHAS GRACIAS POR SU ESPERA");

                    break;

                case 2:
                    
                    Clientes cliente;
                    Nodo InformacionCliente;
                    
                    InformacionCliente = colas.buscarNodoClientePrioritario();
                    cliente = InformacionCliente.getCliente();
                    pilas.AddCajaAtencion1(cliente);
                    colas.EliminarNodoClientePrioritario();
                     mensajes.mostrarInformacion("PROCESO REALIZADO");
                                                                                
                    break;

                case 3:
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 1 \n \n " + pilas.ListarCaja1());
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 2 \n \n " + pilas.ListarCaja2());
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 3 \n \n " + pilas.ListarCaja3());
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 4 \n \n " + pilas.ListarCaja4());
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 5 \n \n " + pilas.ListarCaja5());
                    mensajes.mostrarInformacion("CLIENTES ATENDIDOS EN CAJA 6 \n \n " + pilas.ListarCaja6());
                    break;

                case 4:
                    mensajes.mostrarInformacion("COLA DE CLIENTES PRIORITARIOS \n \n " + colas.ListarColaClientePrioritario());
                    mensajes.mostrarInformacion("COLA DE RETIRO EN EFECTIVO \n \n " + colas.ListarColaRetiroEfectivo());
                    mensajes.mostrarInformacion("COLA DE CAMBIO DE CHEQUE \n \n " + colas.ListarColaCambioCheque());
                    mensajes.mostrarInformacion("COLA DE CONSIGNACION DE CHEQUE \n \n " + colas.ListarColaConsignacionCheque());
                    mensajes.mostrarInformacion("COLA DE PAGO IMPUESTO \n \n " + colas.ListarColaPagoImpuestos());
                    mensajes.mostrarInformacion("COLA DE PAGO DE SERVICIOS \n \n " + colas.ListarColaPagoServicios());
                    mensajes.mostrarInformacion("COLA DE PAGO TARJETA DE CREDITO \n \n " + colas.ListarColaPagoTarjetaCredito());
                    mensajes.mostrarInformacion("COLA DE CONSIGNACION EN EFECTIVO \n \n " + colas.ListarColaConsignacionEfectivo());
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

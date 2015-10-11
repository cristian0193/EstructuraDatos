package PilasColasObjectos;

import javax.swing.JOptionPane;

public class Principal {

    
    Nodo nodo = new Nodo();

    public static void main(String[] args) {

        Colas cola1 = null;
        Colas cola2 = null;
        Colas cola3 = null; 
        Nodo cabeza = null;
        
        Mensajes mensajes = new Mensajes();

        int contador = 0;
        int identificacion = 0;
        String nombre = "";
        String datosCliente = "";

        int opcion;

        do {
            opcion = Principal.menuPrincipal();
            switch (opcion) {

                case 1:
                    while (contador != 3) {
                        try {
                            cola1 = new Colas();
                            cola2 = new Colas();
                            cola3 = new Colas();
                                                        
                            mensajes.mostrarInformacion("ESPERE POR FAVOR HACER ATENDIDO ....... \n" + "PRESIONE ACEPTAR");
                            //Thread.sleep(3000);

                            mensajes.mostrarInformacion("TURNO # " + (contador + 1));

                            identificacion = mensajes.leerInt("Ingrese una Identificacion : ");
                            nombre = mensajes.leerString("Ingrese Nombre de Cliente: ");

                            int numeroEspecial = (int) (Math.random() * 100);
                            int numeroAleatorioCola = (int) (Math.random() * 25);
                            String especial = cola1.estadoEspecial(numeroEspecial);

                            //fun.adicionarClienteCola(new Clientes(identificacion, nombre, especial), numeroAleatorioCola, especial);
                            
                            contador++;
                            
                            if (contador == 1) {
                                cola1.AddCola(new Clientes(identificacion, nombre, especial));
                                System.out.println("contador 1");
                            } else if(contador == 2){
                                cola2.AddCola(new Clientes(identificacion, nombre, especial));
                                 System.out.println("contador 2");
                            }else{
                                cola3.AddCola(new Clientes(identificacion, nombre, especial));
                                 System.out.println("contador 3");
                            }
                            

                            System.out.println("contador : " + contador);
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(null, "ERROR " + ex);
                        }
                    }

                    mensajes.mostrarInformacion("EL DIA DE HOY TERMINA LA JORNADA \n" + "MUCHAS GRACIAS POR SU ESPERA");

                    break;

                case 2:

                    break;

                case 3:
//                    mensajes.mostrarInformacion("" + fun.ListarPila());
                    break;

                case 4:
                    mensajes.mostrarInformacion("COLA DE CLIENTES PRIORITARIOS \n \n " + cola1.ListarCola(cabeza));
                    mensajes.mostrarInformacion("COLA DE RETIRO EN EFECTIVO \n " + cola2.ListarCola(cola1.nodoPrimeroCola));
                    mensajes.mostrarInformacion("COLA DE CAMBIO DE CHEQUE \n " + cola3.ListarCola(cola1.nodoPrimeroCola));
//                  mensajes.mostrarInformacion("COLA DE CONSIGNACION DE CHEQUE \n " + fun.ListarColaConsignacionCheque());
//                  mensajes.mostrarInformacion("COLA DE PAGO IMPUESTO \n " + fun.ListarColaPagoImpuestos());
//                  mensajes.mostrarInformacion("COLA DE PAGO DE SERVICIOS \n " + fun.ListarColaPagoServicios());
//                  mensajes.mostrarInformacion("COLA DE PAGO TARJETA DE CREDITO \n " + fun.ListarColaPagoTarjetaCredito());
//                  mensajes.mostrarInformacion("COLA DE CONSIGNACION EN EFECTIVO \n " + fun.ListarColaConsignacionEfectivo());
                    break;

                case 0:
                    System.exit(0);
                    break;
                default:
                    mensajes.mostrarError("¡La opción no existe!");
            }
        } while (opcion != 0);

    }

    public static int menuPrincipal() {
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

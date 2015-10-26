package PilasColas;

/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Funciones {

    public int cola1 = 0, cola2 = 0, cola3 = 0, cola4 = 0, cola5 = 0, cola6 = 0, cola7 = 0, cola8 = 0;
    public int contador = 0;
    public String nombre = "";

    public Nodo primero;
    public Nodo ultimo;

    Mensajes mensajes = new Mensajes();

    Clientes cliente;
    Nodo InformacionCliente;

    //COLAS
    public Nodo colaPagoTarjetaCredito;
    public Nodo colaPagoImpuestos;
    public Nodo colaRetiroEfectivo;
    public Nodo colaConsignacionEfectivo;
    public Nodo colaConsignacionCheque;
    public Nodo colaCambioCheque;
    public Nodo colaPagoServicios;
    public Nodo colaClientePrioritario;

    //PILAS (CAJAS)
    public Nodo CajaAtencion1;
    public Nodo CajaAtencion2;
    public Nodo CajaAtencion3;
    public Nodo CajaAtencion4;
    public Nodo CajaAtencion5;
    public Nodo CajaAtencion6;

    //CONTADORES
    public int contador1 = 0;
    public int contador2 = 0;
    public int contador3 = 0;
    public int contador4 = 0;
    public int contador5 = 0;
    public int contador6 = 0;
    public int contador7 = 0;
    public int contador8 = 0;

    public int TotalClientesAtendidos = 0;
    public int TotalServicos = 0;
    public int TotalClientesEspeciales = 0;
    public int TotalClienteServicioyTipo = 0;

    public int TotalCaja1 = 0;
    public int TotalCaja2 = 0;
    public int TotalCaja3 = 0;
    public int TotalCaja4 = 0;
    public int TotalCaja5 = 0;
    public int TotalCaja6 = 0;

    public long  contadorTiempoInicio = 0;
    
//VALIDACION DE LISTAS VACIAS PARA COLAS
    public boolean listaVaciaColaPagoTarjetaCredito() {
        return (colaPagoTarjetaCredito == null);
    }

    public boolean listaVaciaColaPagoImpuestos() {
        return (colaPagoImpuestos == null);
    }

    public boolean listaVaciaColaRetiroEfectivo() {
        return (colaRetiroEfectivo == null);
    }

    public boolean listaVaciaColaConsignacionEfectivo() {
        return (colaConsignacionEfectivo == null);
    }

    public boolean listaVaciaColaConsignacionCheque() {
        return (colaConsignacionCheque == null);
    }

    public boolean listaVaciaColaCambioCheque() {
        return (colaCambioCheque == null);
    }

    public boolean listaVaciaColaPagoServicios() {
        return (colaPagoServicios == null);
    }

    public boolean listaVaciaColaClientePrioritario() {
        return (colaClientePrioritario == null);
    }

    //VALIDACION DE LISTAS VACIAS PARA LISTAS
    public boolean listaVaciaPilas() {
        return (ultimo == null);
    }

    public boolean listaVaciaCajaAtencion1() {
        return (CajaAtencion1 == null);
    }

    public boolean listaVaciaCajaAtencion2() {
        return (CajaAtencion2 == null);
    }

    public boolean listaVaciaCajaAtencion3() {
        return (CajaAtencion3 == null);
    }

    public boolean listaVaciaCajaAtencion4() {
        return (CajaAtencion4 == null);
    }

    public boolean listaVaciaCajaAtencion5() {
        return (CajaAtencion5 == null);
    }

    public boolean listaVaciaCajaAtencion6() {
        return (CajaAtencion6 == null);
    }

    // METODOS AGREGAR DATOS A LAS COLAS
    public void AddColaClientePrioritario(Clientes cliente) {

        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaClientePrioritario()) {
            colaClientePrioritario = nuevo;
        } else if (colaClientePrioritario.siguiente == null) {
            colaClientePrioritario.siguiente = nuevo;
        } else {
            Nodo actual = colaClientePrioritario;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaPagoTarjetaCredito(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaPagoTarjetaCredito()) {
            colaPagoTarjetaCredito = nuevo;
        } else if (colaPagoTarjetaCredito.siguiente == null) {
            colaPagoTarjetaCredito.siguiente = nuevo;
        } else {
            Nodo actual = colaPagoTarjetaCredito;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaPagoImpuestos(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaPagoImpuestos()) {
            colaPagoImpuestos = nuevo;
        } else if (colaPagoImpuestos.siguiente == null) {
            colaPagoImpuestos.siguiente = nuevo;
        } else {
            Nodo actual = colaPagoImpuestos;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaRetiroEfectivo(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaRetiroEfectivo()) {
            colaRetiroEfectivo = nuevo;
        } else if (colaRetiroEfectivo.siguiente == null) {
            colaRetiroEfectivo.siguiente = nuevo;
        } else {
            Nodo actual = colaRetiroEfectivo;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaConsignacionEfectivo(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaConsignacionEfectivo()) {
            colaConsignacionEfectivo = nuevo;
        } else if (colaConsignacionEfectivo.siguiente == null) {
            colaConsignacionEfectivo.siguiente = nuevo;
        } else {
            Nodo actual = colaConsignacionEfectivo;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaConsignacionCheque(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaConsignacionCheque()) {
            colaConsignacionCheque = nuevo;
        } else if (colaConsignacionCheque.siguiente == null) {
            colaConsignacionCheque.siguiente = nuevo;
        } else {
            Nodo actual = colaConsignacionCheque;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaCambioCheque(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaCambioCheque()) {
            colaCambioCheque = nuevo;
        } else if (colaCambioCheque.siguiente == null) {
            colaCambioCheque.siguiente = nuevo;
        } else {
            Nodo actual = colaCambioCheque;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public void AddColaPagoServicios(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaPagoServicios()) {
            colaPagoServicios = nuevo;
        } else if (colaPagoServicios.siguiente == null) {
            colaPagoServicios.siguiente = nuevo;
        } else {
            Nodo actual = colaPagoServicios;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

//  METODOS LISTAR DATOS A LAS COLAS
    public String ListarColaClientePrioritario() {
        String mensaje = "";
        if (listaVaciaColaClientePrioritario()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaClientePrioritario.siguiente == null) {
            mensaje = "El Cliente es: " + colaClientePrioritario.getCliente().toString();
        } else {
            Nodo actual = colaClientePrioritario;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaRetiroEfectivo() {
        String mensaje = "";
        if (listaVaciaColaRetiroEfectivo()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaRetiroEfectivo.siguiente == null) {
            mensaje = "El Cliente es: " + colaRetiroEfectivo.getCliente().toString();
        } else {
            Nodo actual = colaRetiroEfectivo;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaCambioCheque() {
        String mensaje = "";
        if (listaVaciaColaCambioCheque()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaCambioCheque.siguiente == null) {
            mensaje = "El Cliente es: " + colaCambioCheque.getCliente().toString();
        } else {
            Nodo actual = colaCambioCheque;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaConsignacionCheque() {
        String mensaje = "";
        if (listaVaciaColaConsignacionCheque()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaConsignacionCheque.siguiente == null) {
            mensaje = "El Cliente es: " + colaConsignacionCheque.getCliente().toString();
        } else {
            Nodo actual = colaConsignacionCheque;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaConsignacionEfectivo() {
        String mensaje = "";
        if (listaVaciaColaConsignacionEfectivo()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaConsignacionEfectivo.siguiente == null) {
            mensaje = "El Cliente es: " + colaConsignacionEfectivo.getCliente().toString();
        } else {
            Nodo actual = colaConsignacionEfectivo;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaPagoImpuestos() {
        String mensaje = "";
        if (listaVaciaColaPagoImpuestos()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaPagoImpuestos.siguiente == null) {
            mensaje = "El Cliente es: " + colaPagoImpuestos.getCliente().toString();
        } else {
            Nodo actual = colaPagoImpuestos;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaPagoServicios() {
        String mensaje = "";
        if (listaVaciaColaPagoServicios()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaPagoServicios.siguiente == null) {
            mensaje = "El Cliente es: " + colaPagoServicios.getCliente().toString();
        } else {
            Nodo actual = colaPagoServicios;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarColaPagoTarjetaCredito() {
        String mensaje = "";
        if (listaVaciaColaPagoTarjetaCredito()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaPagoTarjetaCredito.siguiente == null) {
            mensaje = "El Cliente es: " + colaPagoTarjetaCredito.getCliente().toString();
        } else {
            Nodo actual = colaPagoTarjetaCredito;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public Funciones adicionarClienteCola(Clientes cliente, int aleatorioCola, String especialCola) {

        if (cliente != null) {

            if (especialCola.equals("SI")) {
                AddColaClientePrioritario(cliente);
                contador1++;
            } else {
                if (aleatorioCola >= 0 && aleatorioCola <= 3) {
                    AddColaPagoTarjetaCredito(cliente);
                    contador2++;

                } else if (aleatorioCola > 3 && aleatorioCola <= 5) {
                    AddColaPagoImpuestos(cliente);
                    contador3++;

                } else if (aleatorioCola > 5 && aleatorioCola <= 10) {
                    AddColaRetiroEfectivo(cliente);
                    contador4++;

                } else if (aleatorioCola > 10 && aleatorioCola <= 15) {
                    AddColaConsignacionEfectivo(cliente);
                    contador5++;

                } else if (aleatorioCola > 15 && aleatorioCola <= 20) {
                    AddColaConsignacionCheque(cliente);
                    contador6++;

                } else if (aleatorioCola > 20 && aleatorioCola <= 22) {
                    AddColaCambioCheque(cliente);
                    contador7++;

                } else if (aleatorioCola > 22 && aleatorioCola <= 25) {
                    AddColaPagoServicios(cliente);
                    contador8++;

                } else {
                    System.out.println("Dato No encontrado");
                }
            }

        }
        return this;
    }

    public int contadorClientePrioritario() {
        return contador1;
    }

    public int contadorPagoTarjetaCredito() {
        return contador2;
    }

    public int contadorPagoImpuestos() {
        return contador3;
    }

    public int contadorRetiroEfectivo() {
        return contador4;
    }

    public int contadorConsignacionEfectivo() {
        return contador5;
    }

    public int contadorConsignacionCheque() {
        return contador6;
    }

    public int contadorCambioCheque() {
        return contador7;
    }

    public int contadorPagoServicios() {
        return contador8;
    }

    //  METODOS BUSCAR DATOS A LAS COLAS
    public Nodo buscarNodoPagoTarjetaCredito() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaPagoTarjetaCredito;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoPagoImpuestos() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaPagoImpuestos;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoRetiroEfectivo() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaRetiroEfectivo;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoConsignacionEfectivo() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaConsignacionEfectivo;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoConsignacionCheque() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaConsignacionCheque;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoCambioCheque() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaCambioCheque;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoPagoServicios() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaPagoServicios;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    public Nodo buscarNodoClientePrioritario() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = colaClientePrioritario;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos == 1) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }

        return apuntadorNodoBuscado;
    }

    //  METODOS ELIMIANR DATOS A LAS COLAS
    public void EliminarNodoPagoTarjetaCredito() {
        if (listaVaciaColaPagoTarjetaCredito()) {
            mensajes.mostrarInformacion("No hay datos en la cola pago tarjeta credito");
        } else if (colaPagoTarjetaCredito.siguiente == null) {
            colaPagoTarjetaCredito = null;
        } else {
            Nodo eliminar = colaPagoTarjetaCredito;
            colaPagoTarjetaCredito = colaPagoTarjetaCredito.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoPagoImpuestos() {
        if (listaVaciaColaPagoImpuestos()) {
            mensajes.mostrarInformacion("No hay datos en la cola pago impuestos");
        } else if (colaPagoImpuestos.siguiente == null) {
            colaPagoImpuestos = null;
        } else {
            Nodo eliminar = colaPagoImpuestos;
            colaPagoImpuestos = colaPagoImpuestos.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoRetiroEfectivo() {
        if (listaVaciaColaRetiroEfectivo()) {
            mensajes.mostrarInformacion("No hay datos en la cola retiro efectivo");
        } else if (colaRetiroEfectivo.siguiente == null) {
            colaRetiroEfectivo = null;
        } else {
            Nodo eliminar = colaRetiroEfectivo;
            colaRetiroEfectivo = colaRetiroEfectivo.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoConsignacionEfectivo() {
        if (listaVaciaColaConsignacionEfectivo()) {
            mensajes.mostrarInformacion("No hay datos en la cola consignacion");
        } else if (colaConsignacionEfectivo.siguiente == null) {
            colaConsignacionEfectivo = null;
        } else {
            Nodo eliminar = colaConsignacionEfectivo;
            colaConsignacionEfectivo = colaConsignacionEfectivo.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoConsignacionCheque() {
        if (listaVaciaColaConsignacionCheque()) {
            mensajes.mostrarInformacion("No hay datos en la cola consignacion cheque");
        } else if (colaConsignacionCheque.siguiente == null) {
            colaConsignacionCheque = null;
        } else {
            Nodo eliminar = colaConsignacionCheque;
            colaConsignacionCheque = colaConsignacionCheque.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoCambioCheque() {
        if (listaVaciaColaCambioCheque()) {
            mensajes.mostrarInformacion("No hay datos en la cola cambio cheque");
        } else if (colaCambioCheque.siguiente == null) {
            colaCambioCheque = null;
        } else {
            Nodo eliminar = colaCambioCheque;
            colaCambioCheque = colaCambioCheque.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoClientePrioritario() {
        if (listaVaciaColaClientePrioritario()) {
            mensajes.mostrarInformacion("No hay datos en la cola cliente prioritario");
        } else if (colaClientePrioritario.siguiente == null) {
            colaClientePrioritario = null;
        } else {
            Nodo eliminar = colaClientePrioritario;
            colaClientePrioritario = colaClientePrioritario.siguiente;
            eliminar.siguiente = null;
        }
    }

    public void EliminarNodoPagoServicios() {
        if (listaVaciaColaClientePrioritario()) {
            mensajes.mostrarInformacion("No hay datos en la cola pago servicios");
        } else if (colaPagoServicios.siguiente == null) {
            colaPagoServicios = null;
        } else {
            Nodo eliminar = colaPagoServicios;
            colaPagoServicios = colaPagoServicios.siguiente;
            eliminar.siguiente = null;
        }
    }

    public boolean logica(int cola1, int cola2, int cola3, int cola4, int cola5, int cola6, int cola7, int cola8) {

        if ((cola1 == 0) && (cola2 == 0) && (cola3 == 0) && (cola4 == 0) && (cola5 == 0) && (cola6 == 0) && (cola7 == 0) && (cola8 == 0)) {
            return false;
        }
        return true;
    }

    public String ProcesoCajas() {
        String mensaje = "FINALIZACION DEL PROCESO";

        cola1 = contadorClientePrioritario();
        cola2 = contadorRetiroEfectivo();
        cola3 = contadorCambioCheque();
        cola4 = contadorPagoServicios();
        cola5 = contadorPagoImpuestos();
        cola6 = contadorConsignacionCheque();
        cola7 = contadorConsignacionEfectivo();
        cola8 = contadorPagoTarjetaCredito();

        boolean condicion = true;

        while (condicion) {

            contadorTiempoInicio = System.currentTimeMillis();
                        
//            cola1 != 0 && cola2 != 0 && cola3 != 0 && cola4 != 0 && cola5 != 0 && cola6 != 0 && cola7 != 0 && cola8 != 0
            //ATENCION CAJA 1
            if (cola1 >= 3) {
                int cantidad = 3;
                while (cantidad != 0) {
                    InformacionCliente = buscarNodoClientePrioritario();
                    cliente = InformacionCliente.getCliente();
                    AddCajaAtencion1(cliente);
                    EliminarNodoClientePrioritario();
                    cantidad--;
                    cola1--;
                    TotalCaja1++;
                }

                if (cola6 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion1(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad2--;
                        cola6--;
                        TotalCaja1++;
                    }

                } else {
                    System.out.println("CAJA # 1 CONSIGNACION DE CHEQUE SIN CLIENTES");
                    //mensajes.mostrarInformacion("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                }

                if (cola8 > 0) {
                    int cantidad3 = 1;
                    while (cantidad3 != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion1(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad3--;
                        cola8--;
                        TotalCaja1++;
                    }

                } else {
                    System.out.println("CAJA # 1 PAGO TARJETA DE CREDITO SIN CLIENTES");
                    //mensajes.mostrarInformacion("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                }

            } else if (cola1 > 0 && cola1 < 3) {

                if (cola1 > 0 && cola1 < 3) {
                    int cantidad = cola1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoClientePrioritario();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion1(cliente);
                        EliminarNodoClientePrioritario();
                        cantidad--;
                        cola1--;
                        TotalCaja1++;
                    }
                } else {
                    System.out.println("CAJA # 1 CLIENTE PRIORITARIO SIN CLIENTES");
                }

                if (cola6 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion1(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad2--;
                        cola6--;
                        TotalCaja1++;
                    }

                } else {
                    System.out.println("CAJA # 1 CONSIGNACION DE CHEQUE SIN CLIENTES");
                    //mensajes.mostrarInformacion("CAJA DE CONSIGNACION DE CHEQUE SIN CLIENTES");
                }

                if (cola8 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion1(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad2--;
                        cola8--;
                        TotalCaja1++;
                    }

                } else {
                    //mensajes.mostrarInformacion("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                    System.out.println("CAJA # 1 PAGO TARJETA DE CREDITO SIN CLIENTES");
                }
            } else {
                System.out.println("CAJA # 1 CLIENTES PRIORITARIOS SIN CLIENTES");
            }

            //ATENCION CAJA 2
            if (cola2 > 0 || cola3 > 0 || cola4 > 0) {

                if (cola2 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoRetiroEfectivo();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion2(cliente);
                        EliminarNodoRetiroEfectivo();
                        cantidad--;
                        cola2--;
                        TotalCaja2++;
                    }
                } else {
                    System.out.println("CAJA # 2 RETIRO EFECTIVO SIN CLIENTES");
                }

                if (cola3 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoCambioCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion2(cliente);
                        EliminarNodoCambioCheque();
                        cantidad--;
                        cola3--;
                        TotalCaja2++;
                    }
                } else {
                    System.out.println("CAJA # 2 CAMBIO DE CHEQUE SIN CLIENTES");
                }

                if (cola4 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoServicios();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion2(cliente);
                        EliminarNodoPagoServicios();
                        cantidad--;
                        cola4--;
                        TotalCaja2++;
                    }
                } else {
                    System.out.println("CAJA # 2 PAGO DE SERVICIOS SIN CLIENTES");
                }

            } else {
                System.out.println("LAS COLAS 2,3,4 NO TIENE CLIENTES");
                // mensajes.mostrarInformacion("LAS COLAS NO TIENE CLIENTES");
            }

            //ATENCION CAJA 3           
            if (cola2 > 0 || cola3 > 0 || cola4 > 0) {

                if (cola2 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoRetiroEfectivo();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion3(cliente);
                        EliminarNodoRetiroEfectivo();
                        cantidad--;
                        cola2--;
                        TotalCaja3++;
                    }
                } else {
                    System.out.println("CAJA # 3 RETIRO EFECTIVO SIN CLIENTES");
                }

                if (cola3 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoCambioCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion3(cliente);
                        EliminarNodoCambioCheque();
                        cantidad--;
                        cola3--;
                        TotalCaja3++;
                    }
                } else {
                    System.out.println("CAJA # 3 CAMBIO DE CHEQUE SIN CLIENTES");
                }

                if (cola4 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoServicios();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion3(cliente);
                        EliminarNodoPagoServicios();
                        cantidad--;
                        cola4--;
                        TotalCaja3++;
                    }
                } else {
                    System.out.println("CAJA # 3 PAGO DE SERVICIOS SIN CLIENTES");
                }

            } else {
                System.out.println("LAS COLAS 2,3,4 NO TIENE CLIENTES");
                //mensajes.mostrarInformacion("LAS COLAS 2,3,4 NO TIENE CLIENTES");
            }

            //ATENCION CAJA 4  
            if (cola6 > 0 || cola7 > 0 || cola8 > 0) {

                if (cola6 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion4(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                        cola6--;
                        TotalCaja4++;
                    }
                } else {
                    System.out.println("CAJA # 4 CONSIGNACION CHEQUE SIN CLIENTES");
                }

                if (cola7 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionEfectivo();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion4(cliente);
                        EliminarNodoConsignacionEfectivo();
                        cantidad--;
                        cola7--;
                        TotalCaja4++;
                    }
                } else {
                    System.out.println("CAJA # 4 CONSIGNACION EFECTIVO SIN CLIENTES");
                }

                if (cola8 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion4(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad--;
                        cola8--;
                        TotalCaja4++;
                    }
                } else {
                    System.out.println("CAJA # 4 TARJETA DE CREDITO SIN CLIENTES");
                }

            } else {
                System.out.println("LAS COLAS 6,7,8 NO TIENE CLIENTES");
                //mensajes.mostrarInformacion("LAS COLAS 6,7,8 NO TIENE CLIENTES");
            }

            //ATENCION CAJA 5  
            if (cola6 > 0 || cola7 > 0 || cola8 > 0) {

                if (cola6 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion5(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                        cola6--;
                        TotalCaja5++;
                    }
                } else {
                    System.out.println("CAJA # 5 CONSIGNACION CHEQUE SIN CLIENTES");
                }

                if (cola7 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionEfectivo();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion5(cliente);
                        EliminarNodoConsignacionEfectivo();
                        cantidad--;
                        cola7--;
                        TotalCaja5++;
                    }
                } else {
                    System.out.println("CAJA # 5 CONSIGNACION EFECTIVO SIN CLIENTES");
                }

                if (cola8 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        AddCajaAtencion5(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad--;
                        cola8--;
                        TotalCaja5++;
                    }
                } else {
                    System.out.println("CAJA # 5 PAGO TARJETA DE CREDITO SIN CLIENTES");
                }

            } else {
                System.out.println("LAS COLAS 6,7,8 NO TIENE CLIENTES");
                //mensajes.mostrarInformacion("LAS COLAS 6,7,8 NO TIENE CLIENTES");
            }

            //ATENCION CAJA 6
            if (cola5 > 0) {
                int cantidad = 1;
                while (cantidad != 0) {
                    InformacionCliente = buscarNodoPagoImpuestos();
                    cliente = InformacionCliente.getCliente();
                    AddCajaAtencion6(cliente);
                    EliminarNodoPagoImpuestos();
                    cantidad--;
                    cola5--;
                    TotalCaja6++;
                }
            } else {
                System.out.println("COLA # 5 PAGO DE IMPUESTOS TIENE CLIENTES");
                //mensajes.mostrarInformacion("LA COLA 5 NO TIENE CLIENTES");
            }
            condicion = logica(cola1, cola2, cola3, cola4, cola5, cola6, cola7, cola8);
        }
        return mensaje;
    }

    //METODOS PARA LAS LISTAS
    // METODOS DE PILAS   
    public void AddCajaAtencion1(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion1()) {
            CajaAtencion1 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion1;
            CajaAtencion1 = nuevo;
        }
    }

    public void AddCajaAtencion2(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion2()) {
            CajaAtencion2 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion2;
            CajaAtencion2 = nuevo;
        }
    }

    public void AddCajaAtencion3(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion3()) {
            CajaAtencion3 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion3;
            CajaAtencion3 = nuevo;
        }
    }

    public void AddCajaAtencion4(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion4()) {
            CajaAtencion4 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion4;
            CajaAtencion4 = nuevo;
        }
    }

    public void AddCajaAtencion5(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion5()) {
            CajaAtencion5 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion5;
            CajaAtencion5 = nuevo;
        }
    }

    public void AddCajaAtencion6(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaCajaAtencion6()) {
            CajaAtencion6 = nuevo;
        } else {
            nuevo.anterior = CajaAtencion6;
            CajaAtencion6 = nuevo;
        }
    }

    // METODOS DE MOSTRAR PILAS   
    public String ListarCaja1() {
        String mensaje = "";

        if (listaVaciaCajaAtencion1()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion1.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion1.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion1;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarCaja2() {
        String mensaje = "";
        if (listaVaciaCajaAtencion2()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion2.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion2.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion2;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarCaja3() {
        String mensaje = "";
        if (listaVaciaCajaAtencion3()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion3.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion3.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion3;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarCaja4() {
        String mensaje = "";
        if (listaVaciaCajaAtencion4()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion4.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion4.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion4;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarCaja5() {
        String mensaje = "";
        if (listaVaciaCajaAtencion5()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion5.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion5.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion5;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String ListarCaja6() {
        String mensaje = "";
        if (listaVaciaCajaAtencion6()) {
            mensaje = "No hay datos en la pila";
        } else if (CajaAtencion6.anterior == null) {
            mensaje = "los cliente son: " + CajaAtencion6.getCliente().toString();
        } else {
            Nodo actual = CajaAtencion6;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public String UltimoPila() {
        String mensaje = "";
        if (listaVaciaPilas()) {
            mensaje = "No hay datos en la pila";
        } else {
            mensaje = "el último cliente es: " + ultimo.getCliente().toString();
        }
        return mensaje;
    }

    public String PrimeroPila() {
        String mensaje = "";
        if (listaVaciaPilas()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "el ultimo cliente es: " + ultimo.getCliente().toString();
        } else {
            Nodo actual = ultimo;
            while (actual.anterior != null) {
                actual = actual.anterior;
            }
            mensaje += "\nel primer cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public void EliminarNodoPlia() {
        if (listaVaciaPilas()) {
            mensajes.mostrarInformacion("No hay datos en la pila");
        } else if (ultimo.anterior == null) {
            ultimo = null;
        } else {
            Nodo eliminar = ultimo;
            ultimo = ultimo.anterior;
            eliminar.anterior = null;
        }
    }

    public String CantidadNodosPila() {
        String mensaje = "";
        int contador = 0;
        if (listaVaciaPilas()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "hay un nodo";
        } else {
            Nodo actual = ultimo;
            while (actual.anterior != null) {
                actual = actual.anterior;
                contador++;
            }
            contador++;
            mensaje += "\n El Numero de Cliente es: " + contador;
        }
        return mensaje;
    }

    //METODOS COMPLEMENTARIOS
    public String estadoEspecial(int especial) {

        String estado = "";

        if (especial <= 25) {
            estado = "SI";
        } else {
            estado = "NO";
        }
        return estado;
    }

    /**
     * Método permite crear la lista desde el final ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param estudiante Datos de Estudiante
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarNodoFinal(Clientes estudiante) {
        Nodo nodoAuxiliar, ultimoNodo = getUltimoNodo();

        if (ultimoNodo == null) {
            ultimoNodo = new Nodo(estudiante);
            primero = ultimoNodo;
            contador++;
        } else {
            nodoAuxiliar = new Nodo(estudiante);
            ultimoNodo.setSiguiente(nodoAuxiliar);
            contador++;
        }
        return this;
    }

    /**
     * Método permite buscar y recorrer una lista por su Identificacion
     *
     * @param identificacion identificacion de estudiante
     * @return Nodo
     */
    public Nodo buscarNodo(int identificacion) {
        Nodo apuntadorNodoBuscado;

        apuntadorNodoBuscado = primero;

        while (apuntadorNodoBuscado != null) {
            if (identificacion == apuntadorNodoBuscado.getCliente().getIdentificacionCliente()) {
                return apuntadorNodoBuscado;
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
        }

        return apuntadorNodoBuscado;
    }

    /**
     * Método permite apuntar a ultimo nodo de la lista
     *
     * @return nodo
     */
    private Nodo getUltimoNodo() {
        Nodo lastNode = null;

        if (primero != null) {
            lastNode = primero;
            while (lastNode.getSiguiente() != null) {
                lastNode = lastNode.getSiguiente();
            }
        }
        return lastNode;
    }

    public int totalClientes() {
        int Totalclientes = contadorCambioCheque() + contadorClientePrioritario() + contadorConsignacionCheque() + contadorConsignacionEfectivo() + contadorPagoImpuestos() + contadorPagoServicios() + contadorPagoTarjetaCredito() + contadorRetiroEfectivo();

        return Totalclientes;
    }

    public String totalClientesxServicio() {
        String mensajes = "";

        mensajes = "CLIENTES ESPECIALES : " + contadorClientePrioritario() + "\n"
                + "CLIENTES RETIRO EN EFECTIVO : " + contadorRetiroEfectivo() + "\n"
                + "CLIENTES CAMBIO DE CHEQUE : " + contadorCambioCheque() + "\n"
                + "CLIENTES PAGO DE SERVICIOS : " + contadorPagoServicios() + "\n"
                + "CLIENTES PAGO IMPUESTOS : " + contadorPagoImpuestos() + "\n"
                + "CLIENTES CONSIGNACION DE CHEQUE : " + contadorConsignacionCheque() + "\n"
                + "CLIENTES CONSIGNACION EN EFECTIVO : " + contadorConsignacionEfectivo() + "\n"
                + "CLIENTES PAGO TARJETA DE CREDITO : " + contadorPagoTarjetaCredito() + "\n";

        return mensajes;
    }

    public int totalClientesEspeciales() {
        return contadorClientePrioritario();
    }

    public String totalClientesServicosyTipo() {
        int totalTipos = 0;
        String mensajes = "";

        totalTipos = contadorCambioCheque() + contadorConsignacionCheque() + contadorConsignacionEfectivo() + contadorPagoImpuestos() + contadorPagoServicios() + contadorPagoTarjetaCredito() + contadorRetiroEfectivo();

        mensajes = "TOTAL CLIENTES ESPECIALES : " + contadorClientePrioritario() + " \n"
                + "TOTAL CLIENTES POR TIPO " + totalTipos;

        return mensajes;
    }

    public String clientesAtendidosxCajas() {

        String mensaje = "";
        int tiempoTotal = (int)(contadorTiempoInicio * 0.001);

        mensaje = "CLIENTES ATENDIDOS EN CAJA # 1 : " + TotalCaja1 + "\n"
                + "CLIENTES ATENDIDOS EN CAJA # 2 : " + TotalCaja2 + "\n"
                + "CLIENTES ATENDIDOS EN CAJA # 3 : " + TotalCaja3 + "\n"
                + "CLIENTES ATENDIDOS EN CAJA # 4 : " + TotalCaja4 + "\n"
                + "CLIENTES ATENDIDOS EN CAJA # 5 : " + TotalCaja5 + "\n"
                + "CLIENTES ATENDIDOS EN CAJA # 6 : " + TotalCaja6 + "\n"
                + "------------------------------------------------ \n"
            + "TOTAL TIEMPO TRASCURRIDO : " + contadorTiempoInicio + " milisegundos \n";

        return mensaje;
    }

}

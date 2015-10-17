package PilasColas;

public class Colas {

    Mensajes mensajes = new Mensajes();
//    public Nodo primero;
//    public Nodo ultimo;

    public int cola1 = 0, cola2 = 0, cola3 = 0, cola4 = 0, cola5 = 0, cola6 = 0, cola7 = 0, cola8 = 0;

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
  
    //CONTADORES
    public int contador1 = 0;
    public int contador2 = 0;
    public int contador3 = 0;
    public int contador4 = 0;
    public int contador5 = 0;
    public int contador6 = 0;
    public int contador7 = 0;
    public int contador8 = 0;

    String nombre = "";
//
//    public boolean listaVaciaColas() {
//        return (primero == null);
//    }

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

    public Colas adicionarClienteCola(Clientes cliente, int aleatorioCola, String especialCola) {

        if (cliente != null) {

            if (especialCola.equals("SI")) {
                AddColaClientePrioritario(cliente);
                contador1++;
            } else {
                if (aleatorioCola >= 0 && aleatorioCola <= 3) {
                    AddColaPagoTarjetaCredito(cliente);
                    contadorPagoTarjetaCredito();

                } else if (aleatorioCola > 3 && aleatorioCola <= 5) {
                    AddColaPagoImpuestos(cliente);
                    contadorPagoImpuestos();

                } else if (aleatorioCola > 5 && aleatorioCola <= 10) {
                    AddColaRetiroEfectivo(cliente);
                    contadorRetiroEfectivo();

                } else if (aleatorioCola > 10 && aleatorioCola <= 15) {
                    AddColaConsignacionEfectivo(cliente);
                    contadorConsignacionEfectivo();

                } else if (aleatorioCola > 15 && aleatorioCola <= 20) {
                    AddColaConsignacionCheque(cliente);
                    contadorConsignacionCheque();

                } else if (aleatorioCola > 20 && aleatorioCola <= 22) {
                    AddColaCambioCheque(cliente);
                    contadorCambioCheque();

                } else if (aleatorioCola > 22 && aleatorioCola <= 25) {
                    AddColaPagoServicios(cliente);
                    contadorPagoServicios();

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
        return contador3++;
    }

    public int contadorRetiroEfectivo() {
        return contador4++;
    }

    public int contadorConsignacionEfectivo() {
        return contador5++;
    }

    public int contadorConsignacionCheque() {
        return contador6++;
    }

    public int contadorCambioCheque() {
        return contador7++;
    }

    public int contadorPagoServicios() {
        return contador8++;
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
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
            mensajes.mostrarInformacion("No hay datos en la cola");
        } else if (colaPagoServicios.siguiente == null) {
            colaPagoServicios = null;
        } else {
            Nodo eliminar = colaPagoServicios;
            colaPagoServicios = colaPagoServicios.siguiente;
            eliminar.siguiente = null;
        }
    }

    public String ProcesoCajas() {
        String mensaje = "FINALIZACION DEL PROCESO";
        Pilas pilas = new Pilas();
        
        cola1 = 5;
        cola2 = 0;
        cola3 = 0;
        cola4 = 0;
        cola5 = 0;
        cola6 = 0;
        cola7 = 0;
        cola8 = 0;

        while (cola1 != 0) {

//            cola1 != 0 && cola2 != 0 && cola3 != 0 && cola4 != 0 && cola5 != 0 && cola6 != 0 && cola7 != 0 && cola8 != 0
            //ATENCION CAJA 1
            if (cola1 >= 3) {
                int cantidad = 3;
                while (cantidad != 0) {
                    InformacionCliente = buscarNodoClientePrioritario();
                    cliente = InformacionCliente.getCliente();
                    pilas.AddCajaAtencion1(cliente);
                    EliminarNodoClientePrioritario();
                    cantidad--;
                    cola1--;
                }

                if (cola6 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion1(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad2--;
                    }

                } else {

                    if (cola8 > 0) {
                        int cantidad3 = 1;
                        while (cantidad3 != 0) {
                            InformacionCliente = buscarNodoPagoTarjetaCredito();
                            cliente = InformacionCliente.getCliente();
                            pilas.AddCajaAtencion1(cliente);
                            EliminarNodoPagoTarjetaCredito();
                            cantidad3--;
                        }

                    } else {
                        System.out.println("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                        //mensajes.mostrarInformacion("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                    }

                }

            } else {

                if (cola1 > 0 && cola1 < 3) {
                    int cantidad = 2;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoClientePrioritario();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion1(cliente);
                        EliminarNodoClientePrioritario();
                        cantidad--;
                        cola1--;
                    }
                } else {
                    System.out.println("CAJA DE CLIENTE PRIORITARIO SIN CLIENTES");
                }

                if (cola6 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion1(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad2--;
                    }

                } else {
                    System.out.println("CAJA DE CONSIGNACION DE CHEQUE SIN CLIENTES");
                    //mensajes.mostrarInformacion("CAJA DE CONSIGNACION DE CHEQUE SIN CLIENTES");
                }

                if (cola8 > 0) {
                    int cantidad2 = 1;
                    while (cantidad2 != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion1(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad2--;
                    }

                } else {
                    //mensajes.mostrarInformacion("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                    System.out.println("CAJA DE PAGO TARJETA DE CREDITO SIN CLIENTES");
                }
            }

            //ATENCION CAJA 2
            if (cola2 > 0 || cola3 > 0 || cola4 > 0) {

                if (cola2 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoRetiroEfectivo();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion2(cliente);
                        EliminarNodoRetiroEfectivo();
                        cantidad--;
                    }
                }

                if (cola3 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion2(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                    }
                }

                if (cola4 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoServicios();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion2(cliente);
                        EliminarNodoPagoServicios();
                        cantidad--;
                    }
                }

            } else {
                System.out.println("LAS COLAS NO TIENE CLIENTES");
                // mensajes.mostrarInformacion("LAS COLAS NO TIENE CLIENTES");
            }

            //ATENCION CAJA 3           
            if (cola2 > 0 || cola3 > 0 || cola4 > 0) {

                if (cola2 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoRetiroEfectivo();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion3(cliente);
                        EliminarNodoRetiroEfectivo();
                        cantidad--;
                    }
                }

                if (cola3 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionCheque();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion3(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                    }
                }

                if (cola4 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoServicios();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion3(cliente);
                        EliminarNodoPagoServicios();
                        cantidad--;
                    }
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
                        pilas.AddCajaAtencion4(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                    }
                }

                if (cola7 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionEfectivo();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion4(cliente);
                        EliminarNodoConsignacionEfectivo();
                        cantidad--;
                    }
                }

                if (cola8 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion4(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad--;
                    }
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
                        pilas.AddCajaAtencion5(cliente);
                        EliminarNodoConsignacionCheque();
                        cantidad--;
                    }
                }

                if (cola7 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoConsignacionEfectivo();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion5(cliente);
                        EliminarNodoConsignacionEfectivo();
                        cantidad--;
                    }
                }

                if (cola8 > 0) {
                    int cantidad = 1;
                    while (cantidad != 0) {
                        InformacionCliente = buscarNodoPagoTarjetaCredito();
                        cliente = InformacionCliente.getCliente();
                        pilas.AddCajaAtencion5(cliente);
                        EliminarNodoPagoTarjetaCredito();
                        cantidad--;
                    }
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
                    pilas.AddCajaAtencion6(cliente);
                    EliminarNodoPagoImpuestos();
                    cantidad--;
                }
            } else {
                System.out.println("LA COLA 5 NO TIENE CLIENTES");
                //mensajes.mostrarInformacion("LA COLA 5 NO TIENE CLIENTES");
            }

        }
        return mensaje;
    }

}

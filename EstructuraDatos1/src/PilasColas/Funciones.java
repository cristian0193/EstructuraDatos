package PilasColas;

/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 24Sep2015
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    public Nodo primero;
    public Nodo ultimo;
    
    //PILAS
    public Nodo pila;
    
    //COLAS
    public Nodo colaPagoTarjetaCredito;        
    public Nodo colaPagoImpuestos; 
    public Nodo colaRetiroEfectivo; 
    public Nodo colaConsignacionEfectivo; 
    public Nodo colaConsignacionCheque; 
    public Nodo colaCambioCheque;
    public Nodo colaPagoServicios; 
    
    
    private int contador = 0;
    String nombre = "";

    public boolean listaVaciaPilas() {
        return (ultimo == null);
    }
    
    public boolean listaVaciaColas() {
        return (primero == null);
    }
    
    // FASE METODOS DE PILAS   
    // --------------------- 
    
    public void AddPila(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaPilas()) {
            ultimo = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
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
    
    public String ListarPila() {
        String mensaje = "";
        if (listaVaciaPilas()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "el libro es: " + ultimo.getCliente().toString();
        } else {
            Nodo actual = ultimo;
            while (actual.anterior != null) {
                mensaje += "\nel libro es: " + actual.getCliente().toString();
                actual = actual.anterior;
            }
            mensaje += "\nel libro es: " + actual.getCliente().toString();
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
    
    
    // FASE METODOS DE COLAS
    // --------------------- 
    
    public void AddColaPagoTarjetaCredito(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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
        if (listaVaciaColas()) {
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

    public String UltimoCola() {
        String mensaje = "";
        if (listaVaciaColas()) {
            mensaje = "No hay datos";
        } else if (primero.siguiente == null) {
            mensaje = "El último cliente es: " + primero.getCliente().toString();
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            mensaje += "\nEl último cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }
    
    public String ListarCola() {
        String mensaje = "";
        if (listaVaciaColas()) {
            mensaje = "No hay datos";
        } else if (primero.siguiente == null) {
            mensaje = "El Cliente es: " + primero.getCliente().toString();
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
        }
        return mensaje;
    }

    public void EliminarNodoCola() {
        if (listaVaciaColas()) {
            mensajes.mostrarInformacion("No hay datos en la cola");
        } else if (primero.siguiente == null) {
            primero = null;
        } else {
            Nodo eliminar = primero;
            primero = primero.siguiente;
            eliminar.siguiente = null;
        }
    }

    public String CantidadNodosCola() {
        String mensaje = "";
        int cont = 0;
        if (listaVaciaColas()) {
            mensaje = "No hay datos en la cola";
        } else if (primero.siguiente == null) {
            mensaje = "hay un dato en la cola";
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
                cont++;
            }
            cont++;
            mensaje += "\n El numero de Cliente es: " + cont;
        }
        return mensaje;
    }
    
    /**
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param cliente Datos de Estudiante
     * @param aleatorioCola
     *
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarClienteCola(Clientes cliente, int aleatorioCola) {


        if (cliente != null) {


            if (aleatorioCola >= 0 && aleatorioCola <= 3) {
                AddColaPagoTarjetaCredito(cliente);
                
            } else if (aleatorioCola > 3 && aleatorioCola <= 5) {
                AddColaPagoImpuestos(cliente);

            } else if (aleatorioCola > 5 && aleatorioCola <= 10) {
                AddColaRetiroEfectivo(cliente);

            } else if (aleatorioCola > 10 && aleatorioCola <= 15) {
                AddColaConsignacionEfectivo(cliente);

            } else if (aleatorioCola > 15 && aleatorioCola <= 20) {
                AddColaConsignacionCheque(cliente);

            } else if (aleatorioCola > 20 && aleatorioCola <= 22) {
                AddColaCambioCheque(cliente);

            } else if (aleatorioCola > 22 && aleatorioCola <= 25) {
                AddColaPagoServicios(cliente);

            } else {
                System.out.println("Dato No encontrado");
            }

        }
        return this;
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
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param cliente Datos de Estudiante
     * @param aleatorioCola
     *
     * @return Tipo Funcionan (Clase)
     */
    public Funciones adicionarNodoInicio(Clientes cliente, int aleatorioCola) {
        Nodo nodo;

        nodo = new Nodo(cliente);

        if (nodo != null) {

            nodo.siguiente = nodo;
            //cabeza = nodo;

            if (aleatorioCola >= 0 && aleatorioCola <= 3) {
                //colasPagoTarjetaCredito.add(nodo);
//                System.out.println("PAGO TARJETA DE CREDITO : " + colasPagoTarjetaCredito);
            } else if (aleatorioCola > 3 && aleatorioCola <= 5) {
//                colasPagoImpuestos.add(nodo);
//                System.out.println("PAGO DE IMPUESTOS : " + colasPagoImpuestos);
            } else if (aleatorioCola > 5 && aleatorioCola <= 10) {
//                colasRetiroEfectivo.add(nodo);
//                System.out.println("RETIRO DE EFECTIVO : " + colasRetiroEfectivo);
            } else if (aleatorioCola > 10 && aleatorioCola <= 15) {
//                colasConsignacionEfectivo.add(nodo);
//                System.out.println("CONSIGNACION EFECTIVO : " + colasConsignacionEfectivo);
            } else if (aleatorioCola > 15 && aleatorioCola <= 20) {
//                colasConsignacionCheque.add(nodo);
//                System.out.println("CONSIGNACION CHEQUE : " + colasConsignacionCheque);
            } else if (aleatorioCola > 20 && aleatorioCola <= 22) {
//                colasCambioCheque.add(nodo);
//                System.out.println("CAMBIO DE CHEQUE : " + colasCambioCheque);
            } else if (aleatorioCola > 22 && aleatorioCola <= 25) {
//                colasPagoServicios.add(nodo);
//                System.out.println("PAGO DE SERVICIOS : " + colasPagoServicios);
            } else {
                System.out.println("Dato No encontrado");
            }

        }
        return this;
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


}

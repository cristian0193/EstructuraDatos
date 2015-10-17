package PilasColas;

public class Pilas {

    Mensajes mensajes = new Mensajes();

    public Nodo ultimo;

    //PILAS (CAJAS)
    public Nodo CajaAtencion1;
    public Nodo CajaAtencion2;
    public Nodo CajaAtencion3;
    public Nodo CajaAtencion4;
    public Nodo CajaAtencion5;
    public Nodo CajaAtencion6;

    private int contador = 0;

        
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
    
}

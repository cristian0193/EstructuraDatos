package PilasColasObjectos;

public class Colas {

    public Nodo primero;
    public Nodo ultimo;

    //COLAS
    public Nodo nodoPrimeroCola;
    public Nodo nodoUltimoCola;

    public boolean listaVaciaColaPrimero() {
        return (nodoPrimeroCola == null);
    }

    public boolean listaVaciaColaUltimo() {
        return (nodoUltimoCola == null);
    }

    //METODO DE PUSH
    public void AddCola(Clientes cliente) {
        Nodo nuevo = new Nodo(cliente);
        if (listaVaciaColaPrimero()) {
            nodoPrimeroCola = nuevo;
        } else if (primero.siguiente == null) {
            nodoPrimeroCola.siguiente = nuevo;
        } else {
            Nodo actual = nodoPrimeroCola;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }
        
    // FASE LISTAR DATOS A LAS COLAS
    public String ListarCola(Nodo colaPimero) {
        String mensaje = "";
        if (listaVaciaColaPrimero()) {
            mensaje = "No hay Clientes en Cola";
        } else if (colaPimero.siguiente == null) {
            mensaje = "El Cliente es: " + colaPimero.getCliente().toString();
        } else {
            Nodo actual = colaPimero;
            while (actual.siguiente != null) {
                mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Cliente es: " + actual.getCliente().toString();
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

}

package colas;

import javax.swing.JOptionPane;

public class colasLibros {

    private nodo primero;

    public void Libros() {
        primero = null;
    }

    public boolean listaVacia() {
        return (primero == null);
    }

    public void incluir_nodo(String codigo, String nombre, String autor) {
        nodo nuevo = new nodo(codigo, nombre, autor);
        if (listaVacia()) {
            primero = nuevo;
        } else if (primero.siguiente == null) {
            primero.siguiente = nuevo;
        } else {
            nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public String listar_cola() {
        String mensaje = "";
        if (listaVacia()) {
            mensaje = "No hay datos";
        } else if (primero.siguiente == null) {
            mensaje = "El libro es: " + primero.dato2;
        } else {
            nodo actual = primero;
            while (actual.siguiente != null) {
                mensaje += "\nEl libro es: " + actual.dato2;
                actual = actual.siguiente;
            }
            mensaje += "\nEl libro es: " + actual.dato2;
        }
        return mensaje;
    }

    public String mostrar_Ultimo_nodo() {
        String mensaje = "";
        if (listaVacia()) {
            mensaje = "No hay datos";
        } else if (primero.siguiente == null) {
            mensaje = "El último libro es: " + primero.dato2;
        } else {
            nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            mensaje += "\nEl último libro es: " + actual.dato2;
        }
        return mensaje;
    }

    public void eliminar_nodo() {
        if (listaVacia()) {
            JOptionPane.showMessageDialog(null, "No hay datos en la cola");
        } else if (primero.siguiente == null) {
            primero = null;
        } else {
            nodo eliminar = primero;
            primero = primero.siguiente;
            eliminar.siguiente = null;
        }
    }

    public String Cantidad_de_nodos() {
        String mensaje = "";
        int cont = 0;
        if (listaVacia()) {
            mensaje = "No hay datos en la cola";
        } else if (primero.siguiente == null) {
            mensaje = "hay un dato en la cola";
        } else {
            nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
                cont++;
            }
            cont++;
            mensaje += "\nEl numero de libros es: " + cont;
        }
        return mensaje;
    }
}

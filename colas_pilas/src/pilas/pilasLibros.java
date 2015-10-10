package pilas;

import javax.swing.JOptionPane;

public class pilasLibros {

    public nodo ultimo;

    public pilasLibros() {
        ultimo = null;
    }

    public boolean listaVacia() {
        return ultimo == null;
    }

    public void incluir_nodo(String codigo, String nombre, String autor) {
        nodo nuevo = new nodo(codigo, nombre, autor);
        if (listaVacia()) {
            ultimo = nuevo;
        } else {
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }
    }

    public String ultimo_nodo() {
        String mensaje = "";
        if (listaVacia()) {
            mensaje = "No hay datos en la pila";
        } else {
            mensaje = "el último libro es: " + ultimo.dato2;
        }
        return mensaje;
    }

    public String primer_nodo() {
        String mensaje = "";
        if (listaVacia()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "el último libro es: " + ultimo.dato2;
        } else {
            nodo actual = ultimo;
            while (actual.anterior != null) {
                actual = actual.anterior;
            }
            mensaje += "\nel primer libro es: " + actual.dato2;
        }
        return mensaje;
    }

    public String listar_pila() {
        String mensaje = "";
        if (listaVacia()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "el libro es: " + ultimo.dato2;
        } else {
            nodo actual = ultimo;
            while (actual.anterior != null) {
                mensaje += "\nel libro es: " + actual.dato2;
                actual = actual.anterior;
            }
            mensaje += "\nel libro es: " + actual.dato2;
        }
        return mensaje;
    }

    public void eliminar_nodo() {
        if (listaVacia()) {
            JOptionPane.showMessageDialog(null, "No hay datos en la pila");
        } else if (ultimo.anterior == null) {
            ultimo = null;
        } else {
            nodo eliminar = ultimo;
            ultimo = ultimo.anterior;
            eliminar.anterior = null;
        }
    }

    public String Cantidad_nodo() {
        String mensaje = "";
        int cont = 0;
        if (listaVacia()) {
            mensaje = "No hay datos en la pila";
        } else if (ultimo.anterior == null) {
            mensaje = "hay un nodo";
        } else {
            nodo actual = ultimo;
            while (actual.anterior != null) {
                actual = actual.anterior;
                cont++;
            }
            cont++;
            mensaje += "\nEl numero de libros es: " + cont;
        }
        return mensaje;
    }
}

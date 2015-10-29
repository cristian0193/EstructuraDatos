package Arboles;

/**
 * Esta clase crea una lista y Nodos
 *
 * @author Christian A. Rodriguez
 * @version 1.0
 * @since 25octubre2015
 */
public class Funciones {

    Mensajes mensajes = new Mensajes();
    Nodo raiz;
    int cantidad = 0;
    int altura = 0;
    Nodo izquierda, derecha;

    public Funciones() {
        raiz = null;
    }

    /**
     * Método permite crear la lista desde el inicio ingresado cada nodo por
     * parte de la clase Estudiante
     *
     * @param dato Numero
     */
    public void adicionarNodoArbol(int dato) {
        Nodo nuevo;
        nuevo = new Nodo();
        nuevo.dato = dato;
        nuevo.izquierda = null;
        nuevo.derecha = null;
        
        if (raiz == null) {
            raiz = nuevo;
        } else {
            Nodo anterior = null, nodo;
            nodo = raiz;
            while (nodo != null) {
                anterior = nodo;
                if (dato < nodo.dato) {
                    nodo = nodo.izquierda;
                } else {
                    nodo = nodo.derecha;
                }
            }
            if (dato < anterior.dato) {
                anterior.izquierda = nuevo;
            } else {
                anterior.derecha = nuevo;
            }
        }
    }

    private void imprimirPre(Nodo nodo) {
       
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            mensajes.mostrarInformacion(nodo.dato + " ");
            imprimirPre(nodo.izquierda);
            imprimirPre(nodo.derecha);            
        }        
        
    }

    public void imprimirPre() {
        imprimirPre(raiz);
        System.out.println();
    }

    private void imprimirEntre(Nodo nodo) {
        if (nodo != null) {
            imprimirEntre(nodo.izquierda);
            System.out.print(nodo.dato + " ");
            mensajes.mostrarInformacion(nodo.dato + " ");
            imprimirEntre(nodo.derecha);
        }
    }

    public void imprimirEntre() {
        imprimirEntre(raiz);
        System.out.println();
    }

    private void imprimirPost(Nodo nodo) {
        if (nodo != null) {
            imprimirPost(nodo.izquierda);
            imprimirPost(nodo.derecha);
            System.out.print(nodo.dato + " ");
            mensajes.mostrarInformacion(nodo.dato + " ");
        }
    }

    public void imprimirPost() {
        imprimirPost(raiz);
        System.out.println();
    }

    public void cantidad(Nodo reco) {
        if (reco != null) {
            cantidad++;
            cantidad(reco.izquierda);
            cantidad(reco.derecha);
        }
    }

    public int cantidad() {
        cantidad = 0;
        cantidad(raiz);
        return cantidad;
    }

    private void cantidadNodosHoja(Nodo reco) {
        if (reco != null) {
            if (reco.izquierda == null && reco.derecha == null) {
                cantidad++;
            }
            cantidadNodosHoja(reco.izquierda);
            cantidadNodosHoja(reco.derecha);
        }
    }

    public int cantidadNodosHoja() {
        cantidad = 0;
        cantidadNodosHoja(raiz);
        return cantidad;
    }

    private void imprimirEntreConNivel(Nodo reco, int nivel) {
        if (reco != null) {
            imprimirEntreConNivel(reco.izquierda, nivel + 1);
            System.out.print(reco.dato + " (" + nivel + ") - ");
            imprimirEntreConNivel(reco.derecha, nivel + 1);
        }
    }

    public void imprimirEntreConNivel() {
        imprimirEntreConNivel(raiz, 1);
        System.out.println();
    }

    private void retornarAltura(Nodo reco, int nivel) {
        if (reco != null) {
            retornarAltura(reco.izquierda, nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            retornarAltura(reco.derecha, nivel + 1);
        }
    }

    public int retornarAltura() {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    public void mayorValor() {
        if (raiz != null) {
            Nodo reco = raiz;
            while (reco.derecha != null) {
                reco = reco.derecha;
            }
            mensajes.mostrarInformacion("Mayor valor del árbol:" + reco.dato);
        }
    }

}

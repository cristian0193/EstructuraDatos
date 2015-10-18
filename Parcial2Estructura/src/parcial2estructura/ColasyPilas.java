package parcial2estructura;

public class ColasyPilas {

    public Nodo cola;
    public Nodo pila;
    public Nodo lista;
    public Nodo ultimo;
    
    public int contador = 0;

    /**
     * Metodo valida si la cola esta vacia return cola
     */
    public boolean ListaVaciaCola() {
        return (cola == null);
    }

    /**
     * Metodo valida si la pila esta vacia return pila
     */
    public boolean ListaVaciaPila() {
        return (pila == null);
    }

    /**
     * Metodo para ingresar un nodo a la cola
     *
     * @param numero
     */
    public void AddCola(String numero) {

        Nodo nuevo = new Nodo(numero);
        if (ListaVaciaCola()) {
            cola = nuevo;
            contador++;
        } else if (cola.siguiente == null) {
            cola.siguiente = nuevo;
            contador++;
        } else {
            Nodo actual = cola;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            contador++;
        }
    }

    /**
     * Metodo para ingresar un nodo a la pila
     * @param numero
     */
    public void AddPila(String numero) {
        Nodo nuevo = new Nodo(numero);
        if (ListaVaciaPila()) {
            pila = nuevo;
        } else {
            nuevo.anterior = pila;
            pila = nuevo;
        }
    }

    public String ListarCola() {
        String mensaje = "";
        if (ListaVaciaCola()) {
            mensaje = "No hay Clientes en Cola";
        } else if (cola.siguiente == null) {
            mensaje = "El Dato es: " + cola.getDato();
        } else {
            Nodo actual = cola;
            while (actual.siguiente != null) {
                mensaje += "\nEl Dato es: " + actual.getDato();
                actual = actual.siguiente;
            }
            mensaje += "\nEl Dato es: " + actual.getDato();
        }
        return mensaje;
    }
    
    public String ListarCaja1() {
        String mensaje = "";

        if (ListaVaciaPila()) {
            mensaje = "No hay datos en la pila";
        } else if (pila.anterior == null) {
            mensaje = "los cliente son: " + pila.getDato();
        } else {
            Nodo actual = pila;
            while (actual.anterior != null) {
                mensaje += "\nlos cliente son: " + actual.getDato();
                actual = actual.anterior;
            }
            mensaje += "\nlos cliente son: " + actual.getDato();
        }
        return mensaje;
    }
    
    public boolean ProcesoPalindromo(String palabra) {

        int inc = 0;
        int des = palabra.length() - 1;
        boolean bError = false;

        while ((inc < des) && (!bError)) {

            if (palabra.charAt(inc) == palabra.charAt(des)) {
                inc++;
                des--;
            } else {
                bError = true;
            }
        }
        
        if (!bError) {
            return true;
        } else {
            return false;
        }

    }
       
    public int contadorCola(){        
        return contador;
    }
    
    public void Procesos() {
        Nodo apuntadorNodoBuscado;
        int contadorNodos = 0;

        apuntadorNodoBuscado = cola;
        contadorNodos++;
        while (apuntadorNodoBuscado != null) {
            if (contadorNodos != contadorCola()) {
                
                String palabra = apuntadorNodoBuscado.getDato();
                boolean cadena = ProcesoPalindromo(palabra);
                
                if (cadena){
                    AddPila(palabra);
                } 
                
            }
            apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
            contadorNodos++;
        }
    }
    
    
    
    
}

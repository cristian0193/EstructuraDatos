package Corte_2;

/**
 *
 * @author Christian Rodriguez
 */
public class Lista {
    
    public Nodo cabeza;
    public int numeroElementos;
    MensajesEntradaSalida entrada = new MensajesEntradaSalida();
    /**
     * Metodo constructor la cabeza se lleva a null
     */
    public Lista(){
        cabeza = null;        
    }
    
    /**
     * Se adiciona un nodo a la lista.
     * La adición se hace al final de la lista
     * @param dato
     * @return 
     */
    public Lista adicionarNodo(int dato){
        Nodo nodo, aux;
        
        nodo = new Nodo( dato );
        
        if ( cabeza == null){
            cabeza = nodo;
            aux = cabeza;
        }
        else{
            aux = cabeza;
            while( aux.siguiente != null){
                aux = aux.siguiente;
            }
            
            aux.siguiente = nodo;            
        }
        
        return this;
    }
     
    public Lista adicionarNodoPila(int dato){
        Nodo nodo;
        
        nodo = new Nodo( dato );
        
               if (cabeza == null){
            cabeza =nodo ;
           
             }
        else{
            nodo.siguiente=cabeza;
                   cabeza=nodo;
           }
         return this;  
    }
    
    /**
     * Se verifica si un nodo existe dentro de la lista y se elimina. Hay que
     * tener en cuenta que el nodo a eliminar se el primero (cabeza), un nodo
     * intermedio o un nodo final.
     * @param nodo
     * @return 
     */
    public Lista eliminarNodo(Nodo nodo){
        Nodo aux,anterior;
        
        //Verificamos si es el primer nodo
        if ( cabeza.dato == nodo.dato ){
            cabeza = cabeza.siguiente;
            aux = null;
        }
        else{
            //Buscamos si es un nodo intermedio o final a eliminar
            anterior = aux =  cabeza;
            while( aux != null){
                if ( aux.dato == nodo.dato)
                {
                    if ( aux.siguiente != null){
                        //es un nodo intermedio
                        anterior.siguiente = aux.siguiente;
                    }
                    else{
                        //es un nodo final
                        anterior.siguiente = null;
                    }
                    
                    aux = null;
                }
                else{
                    anterior = aux;
                    aux = aux.siguiente;
                }                    
            }
        }
        
        return this;
    }
    
    public void par(Nodo nodo){
        while(nodo != null){
        if(nodo.dato%2==0){
            entrada.mostrarInformacion(""+nodo.dato);
        }
        nodo=nodo.siguiente;
    }
    }
    
    public void impar(Nodo nodo){
        while(nodo != null){
        if(nodo.dato%2!=0){
            entrada.mostrarInformacion(""+nodo.dato);
        }
        nodo=nodo.siguiente;
    }
    }
    /**
     * Se recorre la lista y se cuentan sus nodos
     * @return contador
     */
    public int contarNodos(){
        int contador = 0;
        Nodo aux = null;
        
        aux = cabeza;
        while( aux != null){
            aux = aux.siguiente;
            contador++;
        }
        
        return contador;
    }
    
    /**
     * Se recorre la lista en forma iterativa y se muestra el contenido de cada
     * nodo
     * @param nodo 
     */
    public void mostrarLista(Nodo nodo){
        if ( nodo != null){
            entrada.mostrarInformacion( "" + nodo.dato);
            mostrarLista( nodo.siguiente );
        }
    }
    public void mostrarListaIterativo(Nodo nodo){
        while(nodo != null){
            entrada.mostrarInformacion(""+nodo.dato);
            nodo=nodo.siguiente;
        }
    }
    /**
     * Se recorre la lista y se busca un nodo dentro de la lista, si se encuentra
     * el nodo se retorna el nodo, de lo contrario se retorna null.
     * @param nodo
     * @return 
     */
    public Nodo buscarNodo(Nodo nodo){
        Nodo aux;
        
        aux = cabeza;
        
        while( aux != null){
            if ( aux.dato == nodo.dato){
                return aux;
            }
            
            aux = aux.siguiente;
        }
        
        return null;
    }
    
}

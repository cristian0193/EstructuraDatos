package  EjemploClaseDoblemente;

/**
 * Esta clase contiene los métodos que actuan sobre la lista doble
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 18Sep2015
 */
 
public class ListaDoble {
   private Nodo cabeza;
   private int numeroElementos;
       
   /**
    * Constructor de la lista
    */
   public ListaDoble() {
      numeroElementos = 0;
      cabeza = null;
   }
    
   /**
    * Regresa el número de elementos en la lista
    * @return numeroElementos
    */
   public int getNumeroElementos() {
      return numeroElementos;
   }
    
   /**
    * Indica si la lista está vacía (true) o posee elementos (false)
    * @return listaEstaVacia
    */
   public boolean estaVacia(){
      boolean listaEstaVacia;
      listaEstaVacia = cabeza == null;
      return listaEstaVacia;
   }
   
   /**
     * Agrega un nodo al inicio de la lista
     * @param estudiante   Datos del estudiante a almacenar en el nodo 
     */
   public void addInicio(Estudiante estudiante){
      Nodo nodoInicio = new Nodo(estudiante);
       
      // Se revisa (valida si la lista está vacía 
      if (estaVacia()) {
         nodoInicio.setSiguiente(cabeza);
         cabeza = nodoInicio;
      }
      else {
         nodoInicio.setSiguiente(cabeza);
         cabeza.setAnterior(nodoInicio);
         cabeza = nodoInicio;
      }      
      numeroElementos++;
   }

   /**
    * Agrega un nodo al final de la lista
    * @param estudiante   Datos del estudiante a almacenar en el nodo 
    */    
   public void addFinal(Estudiante estudiante) {  
      Nodo nodoAuxiliar, ultimoNodo = getUltimoNodo();
      
      if (ultimoNodo == null) {
         ultimoNodo = new Nodo(estudiante);
         cabeza = ultimoNodo;
      }
      else {
         nodoAuxiliar = new Nodo(estudiante);
         ultimoNodo.setSiguiente(nodoAuxiliar);
         nodoAuxiliar.setAnterior(ultimoNodo);
      } 
      numeroElementos++;      
   }

   /**
    * Regresa el último nodo de la lista
    * @return Nodo   Apuntador al último nodo de la lista 
    */      
   private Nodo getUltimoNodo() {
      Nodo lastNode = null;
        
      if (cabeza != null) {
         lastNode = cabeza;
         while (lastNode.getSiguiente() != null){
            lastNode = lastNode.getSiguiente();
         }
      }
      return lastNode;
   }    

   /**
    * Elimina nodo al inicio de la lista
    */
   public void removeInicio(){
      Nodo quitarNodoInicio;
        
      if (!estaVacia()){
         quitarNodoInicio = cabeza;
         cabeza = cabeza.getSiguiente();
         cabeza.setAnterior(null);
         quitarNodoInicio.setSiguiente(null);
         numeroElementos--;
      }
   }  

   /**
    * Elimina nodo al final de la lista
    */
   public void removeFinal () {  
      Nodo quitarNodoFinal;
      
      if (!estaVacia()) {
         quitarNodoFinal = cabeza;
         while (quitarNodoFinal.getSiguiente().getSiguiente() !=null) {
            quitarNodoFinal = quitarNodoFinal.getSiguiente();
         }
         quitarNodoFinal.getSiguiente().setAnterior(null);
         quitarNodoFinal.setSiguiente(null);    
         numeroElementos--;
      }
   }     
 
   /**
    * Muestra todos los nodos de la lista
    */    
   public void mostrarContenidoLista(){
      Nodo temporal;
      
      if (estaVacia()) {
         EntradaSalida.escribir("La lista doble está vacía");
      }
      else {
         EntradaSalida.escribir("Se muestra el contenido de todos los nodos ("+
                                numeroElementos+")");
         temporal = cabeza;
         while (temporal != null) {
            EntradaSalida.escribir(temporal.getEstudiante().toString());
            temporal = temporal.getSiguiente();
         }
      }      
   }     
 
   /**
    * Método que regresa un apuntador al nodo número POSICION
    * @param   posicion              Entero que indica la posición del nodo buscado
    * @return  apuntadorNodoBuscado  Apuntador al nodo ubicado en la posicion POSICION
    */    
   public Nodo buscarNodoPosicion(int posicion){
      Nodo apuntadorNodoBuscado = null;
      int contadorNodos = 0;
      
      if (!estaVacia()) {
         if (posicion <= numeroElementos) {
            apuntadorNodoBuscado = cabeza;
            contadorNodos++;
            while (apuntadorNodoBuscado != null) {
               if (contadorNodos == posicion) {
                  return apuntadorNodoBuscado;
               }
               apuntadorNodoBuscado = apuntadorNodoBuscado.getSiguiente();
               contadorNodos++;
            }
         }
      } 
      return apuntadorNodoBuscado;  
   }    
        
   @Override
   public String toString() {
      return "Lista{" + "cabeza=" + cabeza + ", numeroElementos=" + numeroElementos + "}";
   }
}    


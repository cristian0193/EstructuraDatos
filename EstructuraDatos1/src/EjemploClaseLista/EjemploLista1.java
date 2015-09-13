package  EjemploClaseLista;


/**
 * Esta clase contiene los métodos que actuan sobre la lista
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 04Sep2015
 */
 
public class EjemploLista1 {
   private NodoEjemploLista1 cabeza;
   private int numeroElementos;
       
   /**
    * Constructor de la lista
    */
   public EjemploLista1() {
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
     * @param valorEnteroNodo   Valor entero a almacenar en el nodo 
     */
   public void addInicio(int valorEnteroNodo){
      NodoEjemploLista1 nuevoNodo = new NodoEjemploLista1(valorEnteroNodo);
             
      nuevoNodo.setEnlace(cabeza);
      cabeza = nuevoNodo;
      numeroElementos++;
   }
 
   /**
    * Agrega un nodo al final de la lista
    * @param valorEnteroNodo   Valor entero a almacenar en el nodo 
    */    
   public void addFinal(int valorEnteroNodo) {  
      NodoEjemploLista1 ultimoNodo = getUltimoNodo();
      /*             Versión original
      
      ultimoNodo.setEnlace(new NodoEjemploLista1(valorEnteroNodo));
      numeroElementos++;
      */
      if (ultimoNodo == null) {
         ultimoNodo = new NodoEjemploLista1(valorEnteroNodo);
         cabeza = ultimoNodo;
      }
      else {
         ultimoNodo.setEnlace(new NodoEjemploLista1(valorEnteroNodo));
         /*
         NodoEjemploLista1 nuevoNodo = new NodoEjemploLista1(valorEnteroNodo);
         ultimoNodo.setEnlace(nuevoNodo);
         */
      } 
      numeroElementos++;      
   }

   /**
    * Regresa el último nodo de la lista
    * @return NodoEjemploLista1   Dirección del último nodo de la lista 
    */      
   private NodoEjemploLista1 getUltimoNodo() {
      NodoEjemploLista1 ultimoNodo = null;
        
      if (cabeza != null) {
         ultimoNodo = cabeza;
         while (ultimoNodo.getEnlace() != null){
            ultimoNodo = ultimoNodo.getEnlace();
         }
      }
      return ultimoNodo;
   }    

   /**
    * Elimina nodo al inicio de la lista
    */
   public void removeInicio(){
      NodoEjemploLista1 quitarNodo;
        
      if (!estaVacia()){
         quitarNodo = cabeza;
         cabeza = cabeza.getEnlace();
         quitarNodo.setEnlace(null);
         numeroElementos--;
      }
   }    
     
   /**
    * Elimina nodo al final de la lista
    */
   public void removeFinal () {  
      NodoEjemploLista1 quitarNodo;
      
      if (!estaVacia()) {
         quitarNodo = cabeza;
         while (quitarNodo.getEnlace().getEnlace() !=null) {
            quitarNodo = quitarNodo.getEnlace();
         }
         quitarNodo.setEnlace(quitarNodo.getEnlace().getEnlace());   
  
         numeroElementos--;
      }
   }          
        
   @Override
   public String toString() {
      return "Lista{" + "cabeza=" + cabeza + ", numeroElementos=" + numeroElementos + "}";
   }
}    


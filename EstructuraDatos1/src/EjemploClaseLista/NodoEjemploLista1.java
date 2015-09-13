package  EjemploClaseLista;

/**
 * Esta clase representa el nodo definida para el primer ejemplo de listas
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 04Sep2015
 */
 public class NodoEjemploLista1 {
   private int valorEntero;
   private NodoEjemploLista1 enlace;

   /**
    * Constructor del nodo
    */
   public NodoEjemploLista1() {
        valorEntero = 0;
        enlace = null;
    }
    
    /**
     * Constructor del nodo
     */
    public NodoEjemploLista1(int valorEntero) {
        this();
        this.valorEntero = valorEntero;
    }
    
    /**
     * Constructor del nodo
     */
    public NodoEjemploLista1(int valorEntero, NodoEjemploLista1 enlace) {
        this.valorEntero = valorEntero;
        this.enlace = enlace;
    }
    
    /**
     * Método para consultar o recuperar el valor del entero
     * @return int  Valor del entero
     */
    public int getValorEntero() {
      return valorEntero;
    }
    
    /**
     * Método para consultar o recuperar el valor del enlace
     * @return NodoEjemploLista1 Dirección de memoria 
     */
    public NodoEjemploLista1 getEnlace() {
      return enlace;
    }
    
    /**
     * Método para asignar o cambiar el valor del entero
     * @param valorEntero  Valor a asignar al atributo del nodo
     */
    public void setValorEntero(int valorEntero) {
      this.valorEntero = valorEntero;
    }
    
    /**
     * Método para asignar o cambiar el valor del enlace (apuntador)
     * @param enlace  Valor a asignar al atributo del enlace (es importante recordar que es una dirección de memoria)
     */  
    public void setEnlace(NodoEjemploLista1 enlace) {
      this.enlace = enlace;
    }
    
    @Override
    public String toString() {
        return "Nodo{" + "valorEntero=" + valorEntero + ", enlace=" + enlace + '}';
    }
}


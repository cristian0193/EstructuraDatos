package  EjemploClaseLista;

/**
 * Esta clase crea una lista 
 * @author Bertulfo A. Prado Urrego 
 * @version 1.0
 * @since 05Sep2015
 */
public class Lista1 {
    
    public static void main(String[] args) {
      EjemploLista1 ejemploLista1 = new EjemploLista1();
      EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
/**/
      ejemploLista1.addInicio(5);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addInicio(12457);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addInicio(1000);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addInicio(27);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(-45);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(0);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(32);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(98);
      //EntradaSalida.escribir(ejemploLista1.toString());
      //EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
/**/
      ejemploLista1.addFinal(-125444);
      EntradaSalida.escribir(ejemploLista1.toString());
      EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(0);
      EntradaSalida.escribir(ejemploLista1.toString());
      EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.addFinal(10000);
      EntradaSalida.escribir(ejemploLista1.toString());
      EntradaSalida.escribir("Cantidad Nodos ="+ejemploLista1.getNumeroElementos());
/*
      EntradaSalida.escribir("REmover nodos...");
      
      ejemploLista1.removeInicio();
      EntradaSalida.escribir(ejemploLista1.toString());
      EntradaSalida.escribir("Cantidad Nodos Inicio ="+ejemploLista1.getNumeroElementos());
      
      ejemploLista1.removeFinal();
      EntradaSalida.escribir(ejemploLista1.toString());
      EntradaSalida.escribir("Cantidad Nodos Fin="+ejemploLista1.getNumeroElementos());
 */
    }
}

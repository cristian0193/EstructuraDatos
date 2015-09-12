package Corte_2;

public class Principal {

   
    public static void main(String[] args){
         MensajesEntradaSalida entrada = new MensajesEntradaSalida();
         Principal inicio = new Principal();
        int opcion;
        Lista lista = new Lista();
        Nodo nodo = null;
        
        do{
            opcion = inicio.menu();
            switch( opcion ){
                case 1:
                     lista.adicionarNodoPila( entrada.leerInt("Ingrese un dato de tipo entero:"));
                    break;
                case 2:
                    lista.mostrarLista( lista.cabeza );
                    break;
                case 3:
                    nodo = new Nodo( entrada.leerInt("Ingrese el dato del nodo que quiere BUSCAR"));
                    if ( lista.buscarNodo(nodo) != null)
                        entrada.mostrarInformacion("El nodo " + nodo.dato + " se encuentra en la lista");
                    else
                        entrada.mostrarAdvertencia("El nodo " + nodo.dato + " NOOOO se encuetra dentro de la lista");
                    break;
                case 4:
                    nodo = new Nodo( entrada.leerInt("Ingrese el dato del nodo que quiere ELIMINAR"));
                    lista = lista.eliminarNodo(nodo);
                    break;
                case 5:
                    entrada.mostrarInformacion(" La lista contiene " + lista.contarNodos() + " nodos.");
                    break;
                case 6:
                    lista.mostrarListaIterativo( lista.cabeza );
                    break;
                 case 7:
                    lista = lista.adicionarNodoPila( entrada.leerInt("Ingrese un dato de tipo entero:"));
                    break;
                case 0:
                    opcion = entrada.confirmarSiNo("¿Desea salir del sistema?");
                    break;
                      case 8:
                    lista.par( lista.cabeza );
                    break;
                     case 9:
                    lista.impar( lista.cabeza );
                    break;
                default:
                    entrada.mostrarError("¡La opción no existe!");                                  
            }
        }while( opcion != 0);        
    }
    
    public int menu(){
        MensajesEntradaSalida entrada = new MensajesEntradaSalida();
        String cadena = "M  E  N  U\n "
                + "1) Adicionar nodo\n"
                + "2) Mostrar Lista\n"
                + "3) Buscar nodo\n"
                + "4) Eliminar nodo\n"
                + "5) Contar nodos\n"
                + "6) Mostrar Lista iterativa"
                + "7) Adicionar nodo \n"
                + "8) mostar nodos pares \n"
                + "9) mostar nodos impares  \n"
                + "- - - - - - - - - - - - - - - - -\n"
                + "0) Salir.";
        
        return entrada.leerInt(cadena);                
    }    
}

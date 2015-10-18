package parcial2estructura;

public class Parcial2Estructura {

    public static void main(String[] args) {

        boolean numeroPar;
        Funciones funciones = new Funciones();
        ColasyPilas colas_pilas = new ColasyPilas();
        Mensajes mensajes = new Mensajes();

        String menu = "";
        int contador = 0;

        int opcion;

        do {
            opcion = funciones.menuPrincipal();

            switch (opcion) {

                case 1:
                    
                    opcion = funciones.subMenuPrincipal1();
                    
                    switch (opcion) {

                        case 1:

                            int numeroIngresado = mensajes.leerInt("Ingresar un Numero");
                            String numeroCadena = Integer.toString(numeroIngresado);

                            if (contador > 0) {

                                int numeroAleatorio = (int) (Math.random() * 10);
                                numeroPar = funciones.numeroParoImpar(numeroAleatorio);

                                if (numeroPar) {
                                    funciones.AddFinal(numeroCadena);
                                } else {
                                    funciones.AddInicio(numeroCadena);
                                }

                            } else {
                                funciones.AddInicio(numeroCadena);
                                contador++;
                            }

                            break;

                        case 2:
                            int numeroAleatorio = (int) (Math.random() * 30 + 20);
                            numeroPar = funciones.numeroParoImpar(numeroAleatorio);

                            if (numeroPar) {
                                funciones.MostarListaDerecha();
                            } else {
                                funciones.MostarListaIzquierda();
                            }

                            break;
                            
                        case 0:
                             System.exit(0);
                            break;
                    }


                case 2:
                    
                     opcion = funciones.subMenuPrincipal2();
                    
                     switch (opcion) {

                        case 1:                          
                            
                            String palabra = mensajes.leerString("Ingresar un Numero");
                            colas_pilas.AddCola(palabra);
                                                        
                            break;

                        case 2:                        
                            colas_pilas.Procesos();
                            break;
                    
                        case 3:                        
                            String cola = colas_pilas.ListarCola(); 
                            mensajes.mostrarInformacion(cola);
                            break;
                            
                        case 4:                        
                           String pila = colas_pilas.ListarCaja1(); 
                           mensajes.mostrarInformacion(pila);
                            break;    
                       
                        case 0:                        
                            System.exit(0);
                            break;  
                     
                     }                                                               
                     
                    break;
                                
                case 0:
                    System.exit(0);
                    break;

            }

        } while (opcion != 0);

    }

}

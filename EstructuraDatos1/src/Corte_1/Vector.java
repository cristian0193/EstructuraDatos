package Corte_1;
import java.io.*;

public class Vector {

    
    public static void main(String[] args) {
        
        double numeroTeclado=-1.0, numeroMayor, numeroMenor, menorPositivo, mayorNegativo, sumaNumeros;
        
        double[] vectorNumeros;
        int totalNumeros=0, totalPositivos, totalNegativos;

        vectorNumeros = new double[100];
       
//        for (int posicionVector = 0;posicionVector < 100 && numeroTeclado != 0.0;posicionVector++){
//            numeroTeclado = leerNumero();
//            if (numeroTeclado != 0.0) {
//                totalNumeros++;
//                vectorNumeros[posicionVector] = numeroTeclado;
//            }
//        }

	numeroTeclado = leerNumero();
	for (int posicionVector = 0;posicionVector < 100 && numeroTeclado != 0.0;posicionVector++){                        
                totalNumeros++;
                vectorNumeros[posicionVector] = numeroTeclado;
	    numeroTeclado = leerNumero();
        }

        numeroMayor = numeroMenor = menorPositivo = mayorNegativo = vectorNumeros[0];

        if (vectorNumeros[0] > 0.0) {
            mayorNegativo = 0.0;
        }

        if (vectorNumeros[0] < 0.0) {
            menorPositivo = 0.0;
        }

        totalPositivos = totalNegativos = 0;
        sumaNumeros = 0.0;

        for (int posicionVector = 0;posicionVector < totalNumeros;posicionVector++) {
            sumaNumeros += vectorNumeros[posicionVector];

            if (vectorNumeros[posicionVector] > numeroMayor) {
                numeroMayor = vectorNumeros[posicionVector];
            }

            if (vectorNumeros[posicionVector] < numeroMenor) {
                numeroMenor = vectorNumeros[posicionVector];
            }

            if (vectorNumeros[posicionVector] > 0.0) {
                totalPositivos++;
                if (menorPositivo == 0.0 || vectorNumeros[posicionVector] < menorPositivo) {
                    menorPositivo = vectorNumeros[posicionVector];
                }
            } 
            
            if (vectorNumeros[posicionVector] < 0.0) {
                totalNegativos++;
                if (mayorNegativo == 0.0 || vectorNumeros[posicionVector] > mayorNegativo) {
                    mayorNegativo = vectorNumeros[posicionVector];
                }
            }
        }
        
        if (totalNumeros == 0) {
            System.out.println("No ingresó valores" + '\n');
        } else {
            System.out.println("El total de números ingresados es           " + totalNumeros + '\n');
            if (totalPositivos > 0) {
                System.out.println("El total de números positivos ingresados es " + totalPositivos + '\n');
            } else {
                System.out.println("No ingresó números positivos " + '\n');
            }
            if (totalNegativos > 0) {
                System.out.println("El total de números negativos ingresados es " + totalNegativos + '\n');
            } else {
                System.out.println("No ingresó números  negativos " + '\n');
            }
            System.out.println("El mayor de los números es                  " + numeroMayor + '\n');
            System.out.println("El menor de los números es                  " + numeroMenor + '\n');
            if (menorPositivo != 0.0) {
                System.out.println("El menor de los números positivos es        " + menorPositivo + '\n');
            }
            if (mayorNegativo != 0.0) {
                System.out.println("El mayor de los números negativos es        " + mayorNegativo + '\n');
            }
            System.out.println("La media aritmética es                      " + (sumaNumeros / totalNumeros) + '\n');
        }
    }

    private static double leerNumero() {
        String datoIngresado;
        double numeroLeido=0.0;
        int error;
        BufferedReader datoTeclado = new BufferedReader(new InputStreamReader(System.in));
        do {
            try{
                error = 0;
                System.out.println("Introduzca número real (0 para finalizar): ");
                datoIngresado = datoTeclado.readLine();
                numeroLeido = Double.parseDouble(datoIngresado);
            } catch (IOException e) {
               System.out.println("Dato inválido, vuelva a ingresar "); 
               error = 1;
            }
        } while (error == 1);
        
        return numeroLeido;
    }

}

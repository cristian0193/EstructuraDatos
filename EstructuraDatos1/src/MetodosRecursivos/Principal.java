/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodosRecursivos;

import javax.swing.JOptionPane;

/**
 * @author Usuario
 */
public class Principal {

    public static void main(String[] args) {

        Principal principal = new Principal();
        int factorial = 0;
        int serie = 0;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un Numero : "));
        factorial = principal.FactorialRecursivo(numero);
        serie = principal.serieFibonaci(numero);
        JOptionPane.showMessageDialog(null, "El Factorial es : " + factorial);
        System.out.println("" + serie);

    }

    public int FactorialRecursivo(int numero) {

        if (numero == 0) {
            return 1;
        } else {
            numero = numero * FactorialRecursivo(numero - 1);
            return numero;
        }
    }

    public int serieFibonaci(int numero) {

        int fibo1 = 0;
        int fibo2 = 1;

        if ((fibo1 == 0)|| (fibo1 == 1)){
            return 1;
        }else{
            return serieFibonaci(fibo1 - 1 ) + serieFibonaci(fibo2 - 2);
        }
    }

}

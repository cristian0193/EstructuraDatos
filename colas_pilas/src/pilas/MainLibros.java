package pilas;

import javax.swing.JOptionPane;

public class MainLibros {

    public static void main(String[] args) {

pilasLibros plibros = new pilasLibros();
        String codigo, nombre, autor;
        int opc = 0;
        String mensaje = "Menu Libros\n\n"
                + " 1. Incluir un nodo\n"
                + " 2. Mostrar datos de la pila\n"
                + " 3. Mostrar Ultimo nodo\n"
                + " 4. Eliminar nodo\n"
                + " 5. Numero de datos en la pila\n"
                + " 6. Salir";

        while (opc != 6) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            switch (opc) {
                case 1:
                    codigo = JOptionPane.showInputDialog("Digite el codigo del libro");
                    nombre = JOptionPane.showInputDialog("Digite el nombre del libro");
                    autor = JOptionPane.showInputDialog("Digite el autor del libro " + nombre);
                    plibros.incluir_nodo(codigo, nombre, autor);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, plibros.listar_pila());
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, plibros.ultimo_nodo());
                    break;
                case 4:
                    plibros.eliminar_nodo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, plibros.Cantidad_nodo());
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "digite nuevamente");
                    break;
            }
        }
    }
}
